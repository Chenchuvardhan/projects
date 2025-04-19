package in.olectra.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VechileController {
	@GetMapping(value = "/vechile")
	public ResponseEntity<String> getVechile(@RequestParam String phno) {
		return new ResponseEntity<>("Your Vechile Number AP24NL8785 Registered With " + phno, HttpStatus.OK);
	}
}
