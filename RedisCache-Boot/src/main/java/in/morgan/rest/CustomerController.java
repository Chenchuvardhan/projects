package in.morgan.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.morgan.entity.Customer;
import in.morgan.service.ICustomerService;

@RestController
public class CustomerController {
	@Autowired
	private ICustomerService custService;
    @PostMapping(value = "/register",consumes = "application/json",produces = "application/json")
	public ResponseEntity<Customer> regisrerCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<Customer>(custService.saveCustomer(customer),HttpStatus.CREATED);
	}
    @GetMapping(value = "/all",produces = "application/json")
	public ResponseEntity<List<Customer>> getCustomers() {
		return new ResponseEntity<List<Customer>>(custService.getAllCustomers(),HttpStatus.OK);
	}
	
}
