package in.zee.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import in.zee.service.SubscribeServiceImpl;
import lombok.SneakyThrows;


@Configuration
@EnableWebSecurity
public class ZeeAppSecurity {
	@Autowired
	private SubscribeServiceImpl subService;
    @Bean
     BCryptPasswordEncoder getPwdEncoder() {
    	return new BCryptPasswordEncoder();
    }
    @Bean
     DaoAuthenticationProvider authenticationProvoder() {
    	 DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
    	 daoAuthenticationProvider.setPasswordEncoder(getPwdEncoder());
    	 daoAuthenticationProvider.setUserDetailsService( subService);
    	 return daoAuthenticationProvider;
    }
    @Bean 
    @SneakyThrows
     AuthenticationManager authenticateManager(AuthenticationConfiguration configure) {
    	return configure.getAuthenticationManager();
    }
	@Bean
	@SneakyThrows
	 SecurityFilterChain permission(HttpSecurity http) {
		http.authorizeHttpRequests(req->
		                           req.requestMatchers("/all")
		                              .permitAll()
		                              .anyRequest()
		                              .authenticated()	                             
				).httpBasic(Customizer.withDefaults())
		         .formLogin(Customizer.withDefaults());
		return http.csrf().disable().build();
	}
}
