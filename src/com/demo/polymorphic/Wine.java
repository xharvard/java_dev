package com.demo.polymorphic;

public class Wine {
	
	public Wine() {
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String drink() {
		return "喝的是 " + getName();
	}

	/**
	 * 重写toString()
	 */
	public String toString() {
		return null;
	}
}
