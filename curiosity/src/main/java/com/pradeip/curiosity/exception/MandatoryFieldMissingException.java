package com.pradeip.curiosity.exception;

public class MandatoryFieldMissingException extends DatabaseInteractException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MandatoryFieldMissingException() {
		super();
	}

	public MandatoryFieldMissingException(String message, Throwable cause) {
		super(message, cause);
	}

	public MandatoryFieldMissingException(String message) {
		super(message);
	}

	public MandatoryFieldMissingException(Throwable cause) {
		super(cause);
	}
}
