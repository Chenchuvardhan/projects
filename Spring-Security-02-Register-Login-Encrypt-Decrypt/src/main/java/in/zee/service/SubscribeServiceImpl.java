package in.zee.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import in.zee.entity.Subscriber;
import in.zee.repo.SubscriberRepository;
@Service
public class SubscribeServiceImpl implements ISubscriberService,UserDetailsService {
    @Autowired
	private SubscriberRepository subRepo;
    @Autowired
    private BCryptPasswordEncoder bcryptPwd;
	@Override
	public Subscriber saveSubscriber(Subscriber sub) {
		// TODO Auto-generated method stub
		String encode = bcryptPwd.encode("chenchu");
		System.out.println(encode);
		return subRepo.save(sub);
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Subscriber s = subRepo.findByEmail(username);
		return new User(s.getEmail(),s.getPassword(),Collections.emptyList());
	}
	@Override
	public List<Subscriber> getAllSubscribers() {
		// TODO Auto-generated method stub
		return subRepo.findAll();
	}

}
