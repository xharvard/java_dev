package com.demo.copy;

public class Email {

	private String content="";
	
	public Email(String string, String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		
	}

}
