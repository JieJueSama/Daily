package com.zjx.java2;


/*
 * 		单例设计模式：
 * 		所谓类的单例设计模式，就是采取一定的方法保证在整个软件系统中，对某个类只能存在一个对象实例
 * 
 * 		如何实现
 * 		饿汉式	懒汉式
 * 
 * 		区分饿汉式和懒汉式
 * 		饿汉式：
 * 			坏处：对象加载时间过长
 * 			好处：饿汉式是线程安全的
 * 			
 * 		懒汉式：
 * 			好处：延迟对象的创建
 * 			目前的写法坏处：线程不安全
 * 
 * 
 * 		class Runtime
 */
public class SingletonTest1 {

	public static void main(String[] args) {
		
		Bank instance = Bank.getInstance();
		Bank instance1 = Bank.getInstance();
		System.out.println(instance == instance1);
	}
}

//饿汉式
class Bank{
	
	//1.私有化类的构造器
	private Bank() {
		
	}
	
	//2.内部创建类的对象
	//要求此对象也必须为静态的
	private static Bank instance = new Bank();
	
	//3.提供公共的静态的方法，返回类的对象
	public static Bank getInstance() {
		return instance;
	}
}
