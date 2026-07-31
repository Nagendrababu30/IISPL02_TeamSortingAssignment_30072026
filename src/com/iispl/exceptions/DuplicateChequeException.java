package com.iispl.exceptions;

public class DuplicateChequeException extends Exception {

	public DuplicateChequeException() {
		super("DuplicateChequeException two cheques should have same cheque number.");
	}
	
}
