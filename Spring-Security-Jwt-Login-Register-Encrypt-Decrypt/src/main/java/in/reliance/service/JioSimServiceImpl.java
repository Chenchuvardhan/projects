package in.reliance.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import in.reliance.entity.JioSim;
import in.reliance.repo.JioSimRepository;

@Service
public class JioSimServiceImpl implements IJioSimService,UserDetailsService {
	@Autowired
	private JioSimRepository jioSimRepo;

	
	@Override
	public JioSim saveSim(JioSim jio) {
		// TODO Auto-generated method stub
		return jioSimRepo.save(jio);
	}

	@Override
	public List<JioSim> getAllSims() {
		// TODO Auto-generated method stub
		return jioSimRepo.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		JioSim simUser = jioSimRepo.findByEmail(username);
		return new User(simUser.getEmail(),simUser.getPwd(),Collections.emptyList());
	}

}
