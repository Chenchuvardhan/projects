package in.honeywell.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.honeywell.entity.Product;
import in.honeywell.repo.ProductRepo;

@RestController
public class SecurityController {
	@Autowired
	private ProductRepo prodRepo;

	@PostMapping(value="/register",
			    consumes = "application/json"
			)
	public ResponseEntity<Product> registerProduct(@RequestBody Product p) {
      return new ResponseEntity<Product>(prodRepo.save(p),HttpStatus.CREATED);
	}
}
