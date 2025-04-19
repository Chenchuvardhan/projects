package in.morgan.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	private Engine engine;

	public void startCar() {
		engine.engineStart();
		System.out.println("Car Started....");
	}
}
