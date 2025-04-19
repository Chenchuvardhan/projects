package in.honeywell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringSecurityApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityApplication.class, args);
		
		  String url="http://localhost:8080/aadharnumber";
		  HttpHeaders httpHeaders = new HttpHeaders();
		  httpHeaders.setBasicAuth("chenchu","chenchu"); 
		  HttpEntity<Object> httpEntity = new HttpEntity<Object>(httpHeaders);
		  RestTemplate restTemplate = new RestTemplate(); 
		  ResponseEntity<String> exchange =restTemplate.exchange(url,HttpMethod.GET,httpEntity,String.class); String
		  body = exchange.getBody(); System.out.println(body);
		 
	}
	

}
