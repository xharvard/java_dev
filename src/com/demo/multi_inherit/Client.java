package com.demo.multi_inherit;

public class Client {

	public static void main(String[] args) {
		Son son = new Son();
        System.out.println("Son 的Strong：" + son.getStrong());
        System.out.println("Son 的kind：" + son.getKind());
	}

}
