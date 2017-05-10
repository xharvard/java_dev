package com.demo.innerclass;

public class OuterClass {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public class InnerClass {
		public InnerClass() {
			name = "chenssy";
			age = 23;
		}

		public void display() {
			System.out.println("name：" + getName() + "   ;age：" + getAge());
		}
	}

	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		OuterClass.InnerClass in = out.new InnerClass();
		in.display();
		
		
		
	}

}
