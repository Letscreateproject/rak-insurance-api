package com.rak.exception;


public class LoginFailedException extends RuntimeException{

	private static final long serialVersionUID = 5856257104345192365L;
	
	public LoginFailedException() {
		super();
	}

	public LoginFailedException(final String message) {
		super(message);
	}

}
