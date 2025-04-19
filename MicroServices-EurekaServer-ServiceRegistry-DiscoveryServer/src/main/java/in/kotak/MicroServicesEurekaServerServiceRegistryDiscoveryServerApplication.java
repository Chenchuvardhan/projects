package in.kotak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServicesEurekaServerServiceRegistryDiscoveryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesEurekaServerServiceRegistryDiscoveryServerApplication.class, args);
	}

}
