package tech.pswaldia.jpaauthentication.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tech.pswaldia.jpaauthentication.daos.UserRepository;
import tech.pswaldia.jpaauthentication.entities.User;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<User> user = userRepository.findByUserName(userName);
		// the optional may not have the value.
		user.orElseThrow(() -> new UsernameNotFoundException("Not found "+userName));
		return user.map(MyUserDetails::new).get();
	}
	
}
