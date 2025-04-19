package in.reliance.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import in.reliance.filter.JioFilter;
import in.reliance.service.JioSimServiceImpl;
import lombok.SneakyThrows;

@Configuration
@EnableWebSecurity
public class JioSecurity {
	@Autowired
	private JioSimServiceImpl jioSimServiceImpl;
	@Autowired
	private JioFilter jioFilter;
	@Bean
	PasswordEncoder getPasswordEncoderObject() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	@SneakyThrows
	AuthenticationManager auththenticateManage(AuthenticationConfiguration req) {
		return req.getAuthenticationManager();
	}
	@Bean
	DaoAuthenticationProvider authenicationProvider() {
		DaoAuthenticationProvider authenticationProvider=new DaoAuthenticationProvider();
		authenticationProvider.setPasswordEncoder(getPasswordEncoderObject());
		authenticationProvider.setUserDetailsService(jioSimServiceImpl);
		return authenticationProvider;
	}
	@Bean
	@SneakyThrows
	 SecurityFilterChain requestsSecurity(HttpSecurity sec) {
      sec.csrf().disable().authorizeHttpRequests().requestMatchers("/register","/login")
                     .permitAll()
                     .anyRequest()
                     .authenticated().and().sessionManagement()
                     .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                     .and().authenticationProvider(authenicationProvider())
                     .addFilterBefore(jioFilter,UsernamePasswordAuthenticationFilter.class);         
      return sec.build();
	}
}
