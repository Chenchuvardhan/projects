package in.honeywell.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.SneakyThrows;

@Configuration
public class AppSecurity {
@Bean
@SneakyThrows
SecurityFilterChain security(HttpSecurity http) {
	http.authorizeHttpRequests(req->
	       req.requestMatchers("/kjd").permitAll().anyRequest().authenticated()).httpBasic(Customizer.withDefaults()).formLogin(Customizer.withDefaults());
	return http.csrf().disable().build();
}
}
