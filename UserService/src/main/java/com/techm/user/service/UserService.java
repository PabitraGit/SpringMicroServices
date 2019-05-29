package com.techm.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techm.user.Exception.UserNotFoundException;
import com.techm.user.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository ;
	
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	public User getUser(int userId) {
		Optional<User> user = userRepository.findById(userId);
		if (!user.isPresent())
			throw new UserNotFoundException("User Not Found -" + userId);
		return user.get();
	}

	public User addUsers(User user) {
		return userRepository.save(user);
	}
	
}
