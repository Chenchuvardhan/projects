package in.asian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AccessingSecuredRestControllerThroughSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessingSecuredRestControllerThroughSpringBootApplication.class, args);
		String url="http://localhost:8080/contact";
		RestTemplate rt=new RestTemplate();
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setBasicAuth("user","b74746d5-0ba9-4195-928b-3b6417d7f7d1");
          	HttpEntity<String> httpEntity = new	HttpEntity<>(httpHeaders);
          	String body = rt.exchange(url, HttpMethod.GET,httpEntity,String.class).getBody();
          	System.out.println(body);
	}

}
