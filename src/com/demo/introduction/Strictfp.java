package com.demo.introduction;

import java.util.Arrays;

/**
 * @author xharvard
 * James Gosling 在 1991 年启动 Java 语言项目
 */
public class Strictfp {

	private String s1;
	private char c1;
/**
 * strictfp 关键字
 * 
 * strictfp 的意思是FP-strict，也就是说精确浮点的意思。在Java虚拟机进行浮点运算时，如果没有指定strictfp关键字时，
 * Java的编译器以及运 行环境在对浮点运算的表达式是采取一种近似于我行我素的行为来完成这些操作，以致于得到的结果往往无法令你满意。
 * 而一旦使用了strictfp来声明一个 类、接口或者方法时，那么所声明的范围内Java的编译器以及运行环境会完全依照浮点规范IEEE-754来执行。
 * 因此如果你想让你的浮点运算更加精确， 而且不会因为不同的硬件平台所执行的结果不一致的话，那就请用关键字strictfp。
 * 
 * 你可以将一个类、接口以及方法声明为strictfp，但是不允许对接口中的方法以及构造函数声明strictfp关键字
 * 
 * 保证所有平台运行结果一致。
 */

	strictfp interface A{}
	
	strictfp class B{
		strictfp void fun(){}
	}
	
	public static void main(String[] args){
		Strictfp d01 = new Strictfp();
		System.out.println(d01.s1);
		System.out.println(d01.c1); // 默认值空格
		
		// 数组排序
		int[] data = {2,4,5,8,10,9,7,5,3,1};
		Arrays.sort(data);
		for(int d : data){
			System.out.println(d);
		}
	}
	
	
}
