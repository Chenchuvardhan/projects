package in.kotak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AadharController {
	@Autowired
	private Environment env;

	@GetMapping(value="/aadharcard")
	public String detailsOfAadhar() {
		return "XXXXXX90786 port-" + env.getProperty("server.port");
	}
}
