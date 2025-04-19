package in.zee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.zee.entity.Subscriber;
import in.zee.service.ISubscriberService;

@RestController
public class SubscriberController {
	@Autowired
	private ISubscriberService subService;
	@Autowired
	private BCryptPasswordEncoder bCryptPassword;
    @Autowired
    private AuthenticationManager authenticateManager;
   @PostMapping(value="/login",
		        consumes="application/json",
		        produces={"text/plain"}
		   )
    public ResponseEntity<String> login(@RequestBody Subscriber sub){
	   UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = 
			   new UsernamePasswordAuthenticationToken(sub.getEmail(),sub.getPassword());
	  
    	Authentication authenticate = authenticateManager.authenticate(usernamePasswordAuthenticationToken);
    	boolean authenticated = authenticate.isAuthenticated();
    	if(authenticated)
    		return new ResponseEntity<String>("Login Successfull",HttpStatus.OK);
    	    return new ResponseEntity<String>("Login fail",HttpStatus.BAD_REQUEST); 
    	
    }
	@PostMapping(value = "/register",
			    consumes="application/json",
			    produces="application/json"
			)
	public ResponseEntity<Subscriber> register(@RequestBody Subscriber subscriber) {
		subscriber.setPassword(bCryptPassword.encode(subscriber.getPassword()));
		return new ResponseEntity<Subscriber>(subService.saveSubscriber(subscriber), HttpStatus.CREATED);

	}
	@GetMapping(value    = "/all"
			)
	public ResponseEntity<List<Subscriber>> getSubscribers() {
		return new ResponseEntity<List<Subscriber>>(subService.getAllSubscribers(),HttpStatus.OK);
	}
}
