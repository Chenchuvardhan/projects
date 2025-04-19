package in.morgan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.morgan.component.Car;

@SpringBootApplication
public class AutowiringByNameApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(AutowiringByNameApplication.class, args);
		Car car = run.getBean(Car.class);
		car.startCar();
	}

}
