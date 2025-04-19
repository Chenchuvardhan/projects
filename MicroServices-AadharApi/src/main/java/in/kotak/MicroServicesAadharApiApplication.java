package in.kotak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MicroServicesAadharApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesAadharApiApplication.class, args);
	}

}
