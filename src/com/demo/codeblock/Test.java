package com.demo.codeblock;

/**
 * 
1、静态代码块，它是随着类的加载而被执行，只要类被加载了就会执行，而且只会加载一次，主要用于给类进行初始化。

2、构造代码块，每创建一个对象时就会执行一次，且优先于构造函数，主要用于初始化不同对象共性的初始化内容和初始化实例环境。

3、构造函数，每创建一个对象时就会执行一次。同时构造函数是给特定对象进行初始化，而构造代码是给所有对象进行初始化，作用区域不同。

三者的执行顺序应该为：静态代码块 > 构造代码块 > 构造函数
 *
 */
public class Test {
	/**
	 * 静态代码块
	 */
	static {
		System.out.println("执行静态代码块...");
	}

	/**
	 * 构造代码块
	 */
	{
		System.out.println("执行构造代码块...");
	}

	/**
	 * 无参构造函数
	 */
	public Test() {
		System.out.println("执行无参构造函数...");
	}

	/**
	 * 有参构造函数
	 * 
	 * @param id
	 */
	public Test(String id) {
		System.out.println("执行有参构造函数...");
	}

	public static void main(String[] args) {
		System.out.println("----------------------");
		new Test();
		System.out.println("----------------------");
		new Test("1");
	}

}
