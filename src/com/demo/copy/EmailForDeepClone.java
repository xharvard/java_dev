package com.demo.copy;

import java.io.Serializable;

public class EmailForDeepClone implements Serializable{

	private static final long serialVersionUID = -1823607432140151891L;
	private String content="";
	
	public EmailForDeepClone(String string, String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
		
	}

}
