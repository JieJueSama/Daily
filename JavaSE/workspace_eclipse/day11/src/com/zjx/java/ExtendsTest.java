package com.zjx.java;

/*
 * 	面向对象的特征之二：继承性：
 * 	一、继承性的好处：why
 * 		减少代码冗余，提高了代码的复用性
 * 		便于功能的扩展
 * 		为多态性的使用，提供了前提
 * 
 * 	二、继承性的格式：  class A extends B{}
 * 		A：子类   派生类  subclass
 * 		B:父类    基类、超类   superclass
 * 
 * 		体现：一旦子类A继承父类B之后，子类A就获取了父类B中声明的结构，属性、方法
 * 			特别的  父类中声明的私有的属性和方法，子类继承父类后以后，仍然认为获取了父类的私有结构，只是因为封装性的影响，使得子类不能直接调用父类的结构而已
 * 			子类继承父类以后，还可以声明自己额外的属性和方法，实现功能的拓展
 * 			子类和父类的关系不同于子集和集合的关系
 * 		extends:延伸、扩展
 * 
 * 	三、Java中关于继承性的规定：
 * 		一个类可以被多个子类继承
 * 		Java中类的单继承性，一个类只能有一个父类
 * 		子父类是相对的概念
 * 		子类直接继承的父类为直接父类，间接继承的父类为间接父类
 * 		子类继承父类后，就获取了直接父类和间接父类的所有属性和方法
 * 
 * 
 * 	四、如果我们没有显式的声明一个类的父类的话，则此类继承于java.lang.Object类
 * 		所有的java类（除了java.lang.Object之外）都直接或间接继承了java.lang.Object类
 * 		意味着，所有的java类具有java.lang.Object类声明的功能
 */

public class ExtendsTest {
	
	public static void main(String[] args) {
		Person p1 = new Person();
//		p1.age = 1;
		
		Student s1 = new Student();
		
		s1.breath();
//		s1.age = 10;
		
//		s1.sleep();
		
		s1.getAge();
		
		
		
	}

}
