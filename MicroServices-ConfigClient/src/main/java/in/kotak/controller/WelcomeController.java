package in.kotak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@Value("${msg}")
	private String msg;
	@Autowired
    private Environment env;
    @GetMapping(value="/msg")
	public String getMsg() {
	return msg+env.getProperty("server.port");
	}
}
