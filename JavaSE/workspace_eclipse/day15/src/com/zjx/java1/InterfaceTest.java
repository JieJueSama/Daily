package com.zjx.java1;

/*
 * 	接口的使用：
 * 		1.接口使用interface来定义
 * 		2.Java中，接口和类是并列的两个结构
 * 		3.如何定义接口：定义接口中的成员
 * 			
 * 			3.1 JDK7及以前：只能定义全局常量和抽象方法
 * 					>全局常量：public static final的但是书写时，可以省略不写
 * 					>抽象方法：public abstract的
 * 			
 * 			3.2 JDK8：除了定义全局常量和抽象方法之外，还可以定义静态方法、默认方法
 * 					>
 * 
 * 
 * 
 * 
 * 		4.接口不能定义构造器,意味着接口不可以实例化
 * 
 * 		5.Java开发中，接口都通过让类去实现（implements）的方式去使用
 * 			如果实现类覆盖了接口中的所有抽象方法，则此实现类就可以实例化
 * 			如果实现类没有覆盖接口中的所有抽象方法，则此实现类仍为一个抽象类
 * 
 * 		6.Java类可以实现多个接口 ---> 弥补了Java类单继承的局限性
 * 			格式： class AA extends BB implements CC,DD,EE
 * 
 * 		7.接口与接口之间可以继承，可以多继承
 * 
 * *************************************************************
 * 
 * 		8.接口具体的使用：体现了多态性
 * 
 * 		9.接口，实际上可以看做是一种规范
 * 
 * 
 * 		面试题：抽象类和接口的异同：
 * 
 */ 
public class InterfaceTest {
	
	public static void main(String[] args) {
		System.out.println(Flyable.MAX_SPEED);
		System.out.println(Flyable.MIN_SPEED);
//		Flyable.MAX_SPEED = 2;
		
		Plane p = new Plane();
		
		p.fly();
	}

}

interface Attack{
	
}

interface Flyable{
	
	
	//全局常量
	public static final int MAX_SPEED = 7900;//第一宇宙速度
	
	int MIN_SPEED = 1;
	
	//抽象方法
	public abstract void fly();
	
	//省略了public abstract
	void stop();
	
//	public Flyable{
//		
//	}
	
}


class Plane implements Flyable{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("fly");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("stop");
		
	}
	
}

abstract class Kite implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	
}


class Bullet implements Flyable, Attack, CC{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
	
}
//**************************************************************
interface AA{
	
	void method1();
	
}

interface BB{
	
	void method2();
}

interface CC extends AA,BB{
	
}





















