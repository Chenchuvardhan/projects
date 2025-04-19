package in.honeywell.security;

import static org.springframework.security.core.userdetails.User.withDefaultPasswordEncoder;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class AppConfiguration {
	/*@Bean
	 InMemoryUserDetailsManager inMemoryUsers() {
	    UserDetails userDetails1 = withDefaultPasswordEncoder().username("sony").password("sony").build();
	    UserDetails userDetails2 = withDefaultPasswordEncoder().username("naga").password("naga").build();
	    UserDetails userDetails3 = withDefaultPasswordEncoder().username("soma").password("soma").build();
	   return new InMemoryUserDetailsManager(userDetails1,userDetails2,userDetails3);
	}*/
    @Bean
     SecurityFilterChain security(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((request) -> 
			request.requestMatchers("/contact", "/login").permitAll().anyRequest().authenticated())
		    .httpBasic(Customizer.withDefaults())
		    .formLogin(Customizer.withDefaults());
		return http.csrf().disable().build();
	}
}
