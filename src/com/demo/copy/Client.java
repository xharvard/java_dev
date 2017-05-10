package com.demo.copy;

/**
 * Object 类的 clone() 方法基本规则如下：(浅拷贝)
1、基本类型
如果变量是基本很类型，则拷贝其值，比如 int、float 等。
2、对象
如果变量是一个实例对象，则拷贝其地址引用，也就是说此时新对象与原来对象是公用该实例变量。
3、String 字符串
若变量为 String 字符串，则拷贝其地址引用。但是在修改时，它会从字符串池中重新生成一个新的字符串，原有的对象保持不变。

利用序列化实现对象的拷贝：(深拷贝)

 */
public class Client {

	public static void main(String[] args) {
		Email email = new Email("请参加会议","请与今天12:30到二会议室参加会议...");
		Person person1 =  new Person("张三",email);
		
		Person person2 =  person1.clone();
        person2.setName("李四");
        Person person3 =  person1.clone();
        person3.setName("王五");
        
        // 浅拷贝导致其他对象的content也变化了
        person1.getEmail().setContent("请与今天12:00到二会议室参加会议...");
        
        System.out.println(person1.getName() + "的邮件内容是：" + person1.getEmail().getContent());
        System.out.println(person2.getName() + "的邮件内容是：" + person2.getEmail().getContent());
        System.out.println(person3.getName() + "的邮件内容是：" + person3.getEmail().getContent());
	}

}
