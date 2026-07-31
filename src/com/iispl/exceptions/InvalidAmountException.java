package com.iispl.exceptions;

public class InvalidAmountException extends Exception {

	public InvalidAmountException() {
		
		super("InvalidAmountException amount cannot be less than zero.");
		
	}
	
}
