package in.morgan.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value = "diesel engine")
//@Service
//@Controller
//@Repository
@Primary
public class DeiselEngine implements Engine {

	@Override
	public void engineStart() {
		// TODO Auto-generated method stub
		System.out.println("diesel engine started....  ");

	}

}
