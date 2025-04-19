package in.morgan.component;

import org.springframework.stereotype.Component;

@Component(value = "electrical engine")
public class ElectricalEngine implements Engine {

	@Override
	public void engineStart() {
		// TODO Auto-generated method stub
		System.out.println("elecrical engine started....  ");
	}

}
