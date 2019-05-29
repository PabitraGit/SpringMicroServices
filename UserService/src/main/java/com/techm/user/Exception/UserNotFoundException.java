package com.techm.user.Exception;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String message) {
		super(message);
	}
}
