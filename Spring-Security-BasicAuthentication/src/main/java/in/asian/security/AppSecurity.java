package in.asian.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.SneakyThrows;

@Configuration
@EnableWebSecurity
public class AppSecurity {
	@Bean
	@SneakyThrows
	public SecurityFilterChain security(HttpSecurity httpRequest) {
             httpRequest.authorizeHttpRequests(request->
                               request.requestMatchers("/contact")
                               .permitAll()
                               .anyRequest()
                               .authenticated()
            		 );
		return httpRequest.build();
	}
}
