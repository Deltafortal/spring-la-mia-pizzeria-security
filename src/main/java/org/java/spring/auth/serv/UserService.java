package org.java.spring.auth.serv;

import java.util.List;

import org.java.spring.auth.pojo.User;
import org.java.spring.auth.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService{
	
	
	@Autowired
	private UserRepository userRepo;
	
	
	public List<User> findAll(){
		
		return userRepo.findAll();
	}
	
	
	
	public User findById(int id) {
		
		return userRepo.findById(id).get();
	}
	
	
	
	public void save(User user) {
		
		userRepo.save(user);
	}
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepo.findByUsername(username);
		
		if (user == null) throw new UsernameNotFoundException("Username not found");
		
		return user;
	}
}
