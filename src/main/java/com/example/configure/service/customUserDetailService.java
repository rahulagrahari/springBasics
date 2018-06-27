package com.example.configure.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.configure.model.CustomUserDetails;
import com.example.configure.repo.UsersRepo;
import com.example.learning.model.User;


@Service
public class customUserDetailService implements UserDetailsService {

	@Autowired
	private UsersRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = userRepo.findByName(username);
		user.orElseThrow(() -> new UsernameNotFoundException("user not found"));
		return user.map(CustomUserDetails::new).get();
		
	}
	
	

}
