package com.capgemini.sfdc.ex;

public class InvalidVoterException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidVoterException() {
		super();
	}

	public InvalidVoterException(String message) {
		super(message);
	}

}
