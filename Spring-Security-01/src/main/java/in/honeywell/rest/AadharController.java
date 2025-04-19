package in.honeywell.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AadharController {
	@GetMapping("/aadharnumber")
	public String getAadharCardNumber() {
		return "your AadharNumber is " + 874787389834L;
	}
	@GetMapping(value = "/login") 
	public String getLogIn() {
		return "welcome to login page";
	}
	@GetMapping(value="/contact")
	public String getContactNumber() {
		return "Contact Details "+9872727263L;
	}
}
