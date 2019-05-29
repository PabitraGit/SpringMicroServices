package com.techm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techm.user.model.User;
import com.techm.user.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> users(){
		return userService.getAllUsers();
	}
	
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable("userId") int userId){
		return userService.getUser(userId);
	}
	
	@PostMapping("/users")
	public User addUsers(@RequestBody User user){
		return userService.addUsers(user);
	}
	
}
