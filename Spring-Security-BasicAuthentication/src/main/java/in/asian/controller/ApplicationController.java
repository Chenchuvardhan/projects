package in.asian.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	@GetMapping(value = "/contact",
			    consumes= {"application/json","application/xml"}, 
			    produces = {"application/json","application/xml"}
			    )
	public ResponseEntity<String> getContatct()
	{
		return new ResponseEntity<>("contact+"+91+" 8788564644",HttpStatus.OK);
	}
}
