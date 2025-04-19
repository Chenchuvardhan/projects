package in.reliance.filter;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import in.reliance.service.JWTService;
import in.reliance.service.JioSimServiceImpl;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class JioFilter extends OncePerRequestFilter {
	@Autowired
	private JWTService jwtService;
	@Autowired
	private JioSimServiceImpl jioService;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// take request header
		String token = null;
		String userName = null;
		String authenticationHeader = request.getHeader("Authorization");
		if (authenticationHeader != null && authenticationHeader.startsWith("Bearer ")) {
			token = authenticationHeader.substring(7);
			userName = jwtService.extractUsername(token);
		}
		if (userName != null && SecurityContextHolder.getContext().getAuthentication() == null) {
			UserDetails userDetails = jioService.loadUserByUsername(userName);
			boolean validateToken = jwtService.validateToken(token, userName);
			if (validateToken) {
				UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities());
				authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(authenticationToken);
			}
		}
         filterChain.doFilter(request, response);
	}

}
