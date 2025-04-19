package in.morgan.component;

import org.springframework.stereotype.Component;

@Component(value = "petrol engine")
public class PetrolEngine implements Engine {

	@Override
	public void engineStart() {
		// TODO Auto-generated method stub
		System.out.println("petrol engine started....  ");

	}

}
