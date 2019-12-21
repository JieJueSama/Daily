package com.zjx.java;

/*
 * 
 * 		类中方法的声明和使用
 * 
 * 		方法：描述类应该具有的功能
 * 
 * 		方法的声明：权限的修饰符  返回值类型  方法名（形参列表）{
 * 			方法体
 * 		}
 *
 * 		注意：static、final、abstract 来修饰方法
 * 
 * 		
 * 		说明：
 * 			关于权限修饰符：
 * 					Java规定的4种权限修饰符：private、public、缺省、protected
 * 
 * 		
 * 			返回值类型：有返回值 vs 无返回值
 * 					如果方法有返回值，则必须在方法声明时，制定返回值类型。同时，在方法中，需要使用return关键字来返回指定类型的变量或常量
 * 					如果方法没有返回值，则方法声明时，使用 void来表示
 * 
 * 			方法名：属于标识符
 * 			形参列表：方法可以声明0个1个或多个形参
 * 				格式：数据类型1 形参1。。。
 * 			方法体：方法功能的体现
 * 
 * 
 * 
 * 		return关键字的使用：
 * 			使用范围：使用在方法体中
 * 			作用：结束方法
 * 				针对于有返回值类型的方法，使用“return 数据”方法返回所要的数据
 * 			注意点：return关键字后面不可以声明执行语句
 * 
 * 
 * 		方法的使用中，可以调用当前类中的属性或方法
 * 		方法中不可以定义方法
 */

public class CustomerTest {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		
		c1.sleep(10);
	}
}

class Customer{
	
	//属性
	String name;
	int age;
	boolean isMale;
	
	
	//方法
	public void eat() {
		System.out.println("吃");
	}
	
	public void sleep(int hour) {
		System.out.println("睡" + hour + "小时");
		eat();
	}
	
	public String getName() {
		return name;
	}
	
	public String getNation(String nation) {
		String info = "国籍" + nation;
		
		return info;
		
	}
	
	
	
	
	
	
}
