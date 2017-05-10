package com.demo.copy;

import java.io.Serializable;

public class PersonForDeepClone implements Serializable {
	private static final long serialVersionUID = -6211445634217616187L;
	private String name;
	private EmailForDeepClone email;

	public PersonForDeepClone(String name, EmailForDeepClone email) {
		this.name = name;
		this.email = email;
	}

	public PersonForDeepClone(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EmailForDeepClone getEmail() {
		return email;
	}

	public void setEmail(EmailForDeepClone email) {
		this.email = email;
	}
}
