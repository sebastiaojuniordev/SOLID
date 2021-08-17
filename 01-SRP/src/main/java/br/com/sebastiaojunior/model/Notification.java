package br.com.sebastiaojunior.model;

import java.text.MessageFormat;

public class Notification {

	private String message;

	public Notification(String message) {
		super();
		this.message = message;
	}

	public Notification(String message, Object... arguments) {
		super();
		this.message = MessageFormat.format(message, arguments);
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
