package com.zjx.java;
/*
 * 
 * 		面向对象的特征之一：封装和隐藏
 * 
 * 		一、问题的引入
 * 
 * 		二、封装性的体现：
 * 			我们将类的属性私有化 private   同时提供公共public方法来获取getXxxx和设置setXxxx
 * 			不对外暴露私有的方法
 * 			单例模式
 * 
 * 		三、封装性的体现，需要权限修饰符来配合
 * 			1.Java规定的4种权限（从小到大）：private、缺省 default、protected、public
 * 			2.4中权限可以用来修饰类的内部结构：属性、方法、构造器、内部类
 * 			修饰类的话，只能使用：缺省、public
 * 		总结封装性：Java提供了四种权限修饰符来修饰类及类的内部结构，体现类及类的内部结构在被调用时的可见性的大小	
 */
public class AnimalTest {

	
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "aaa";
//		a.legs = 4;
		a.age = 6;
		
		a.setLegs(6);
		a.setLegs(-6);
		a.show();
	}
}

class Animal{
	
	String name;
	int age;
	private int legs;
	
	public void setLegs(int l) {
		if(l > 0 && l % 2 == 0) {
			legs = l;
		}else {
			legs = 0;
		}
	}
	
	public int getLegs() {
		return legs;
	}
	
	public void eat() {
		System.out.println("吃");
	}
	
	public void show() {
		System.out.println(name + " " + age + " " + legs);
	}
}
