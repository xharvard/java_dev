package com.demo.innerclass;

/**
 * 匿名内部类
 * 
 * @author Administrator
 *
 */
public class AnonymousInnerClass {

	public void test(Bird bird) {
		System.out.println(bird.getName() + "能够飞 " + bird.fly() + "米");
	}

	public static void main(String[] args) {
		AnonymousInnerClass ai = new AnonymousInnerClass();
		ai.test(new Bird() {

			@Override
			public int fly() {
				return 10000;
			}

			public String getName() {
				return "大雁";
			}
		});
	}
}
