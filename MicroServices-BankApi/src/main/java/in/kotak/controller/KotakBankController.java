package in.kotak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.kotak.client.AadharClient;

@RestController
public class KotakBankController {
	@Autowired
	private AadharClient aadharClient;
	@GetMapping(value="/details")
	public String getBankDetails() {
		return "your bank account-XXXXXX9878 linked with Aadhar :"+aadharClient.getAadharCard();
	}
}
