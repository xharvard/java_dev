package com.demo.arrays;

public class Demo {

	public static void main(String[] args) {
		Integer[] origin = {1,2,3,4,5};
		System.out.println(origin.length);
		
		Integer[] new1 = ArrayUtils.expandCapacity(origin, 10);
		new1[10]=100;
		System.out.println(new1.length + "----" + new1[10]);
		
		Integer[] new2 = ArrayUtils.expandCapacity(origin);
		System.out.println(new2.length);
		
		Integer[] new3 = ArrayUtils.expandCapacityMul(origin, 5);
		System.out.println(new3.length);
	}

}
