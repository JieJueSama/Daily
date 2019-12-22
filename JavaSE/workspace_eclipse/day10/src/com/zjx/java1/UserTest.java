package com.zjx.java1;
/*
 * 
 * 		总结：属性赋值的先后顺序
 * 
 * 
 * 		1.默认初始化值
 * 		2.显式初始化
 * 		3.构造器中赋值
 * 		4.通过  对象.方法  或   对象.属性  的方式赋值
 * 
 * 
 * 		以上操作的先后顺序 1 - 2 - 3 - 4
 */

public class UserTest {

	
	public static void main(String[] args) {
		
		User user = new User();
		
		System.out.println(user.age);
		
		User user1 = new User(2);
		
		System.out.println(user1.age);
		
		user1.setAge(3);
		
		System.out.println(user1.age);
	}
}

class User{
	String name;
	int age = 1;
	
	
	public User() {
		
	}
	
	
	
	public User(int a) {
		age = a;
	}
	
	
	public void setAge(int a) {
		age = a;
	}
}
