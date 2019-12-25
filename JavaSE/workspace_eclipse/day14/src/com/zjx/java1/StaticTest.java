package com.zjx.java1;


/*
 * 	static关键字的使用：
 * 	
 * 	1.static：静态的
 * 	2.static可以用来修饰：属性、方法、代码块、内部类
 * 
 * 
 * 	3.使用static修饰属性：静态变量（或类变量）
 * 		3.1属性，按是否使用static修饰分为	静态属性	和	非静态属性（实例变量）
 * 			实例变量：我们创建了类的多个对象，每个对象都独立拥有一套类中的费静态属性，当修改其中一个对象中非静态属性时，不会导致其他对象中同样的属性值修改。
 * 			静态变量：我们创建了类的多个对象，多个对象共享同一个静态变量，当通过某一个对象修改静态变量时，会导致其他对象调用此静态变量时，是修改过了的。
 * 		3.2static修饰属性的其他说明
 * 			静态变量随着类的加载而加载，可以通过“类.静态变量”的方式进行调用
 * 			静态变量的加载早于对象的创建
 * 			由于类只会加载一次，则静态变量在内存中也只会存在一份，存在方法区的静态域中
 * 			
 * 				类变量		实例变量
 * 			类	yes			no
 * 			对象	yes			yes
 * 
 * 		3.3静态属性举例：System.out	Math.PI
 * 
 * 	4.使用static修饰方法：静态方法
 * 		4.1随着类的加载而加载，可以通过“类.静态方法方法”的方式调用
 * 
 * 		4.2		静态方法		非静态方法
 * 			类	yes			no
 * 			对象	yes			yes
 * 		4.3静态方法中，只能调用静态方法和属性
 * 			非静态方法，既可以调用非静态的方法或属性，也可以调用静态的方法或属性
 * 
 * 	5.static注意点：
 * 		5.1在静态的方法内，不能使用this关键字、super关键字
 * 		5.2关于静态属性和静态方法的使用，大家都从生命周期的角度去解释
 * 
 * 
 * 	6.开发中，如何确定一个属性声明为static
 * 		》属性可以被多个对象所共享，大家都从生命周期的角度去理解
 * 		》类中的常量也常常声明为static
 * 		
 * 
 * 
 * 	 开发中，如何确定一个方法声明为static
 * 		》操作静态属性的方法，通常设置为static的
 * 		》工具类中的方法，习惯上声明为static的。比如Mtah、Arrays、Coolections
 * 		
 * 
 */
public class StaticTest {

	
	public static void main(String[] args) {
		
		Chinese.nation = "中国";
		Chinese.show();
		
		Chinese c1 = new Chinese();
		c1.name = "Tom";
		c1.age = 40;
		c1.nation = "CHN";
		
		Chinese c2 = new Chinese();
		c2.name = "Jerry";
		c2.age = 30;
		c2.nation = "CHINA";
		System.out.println(c2.nation);
		
		//编译不通过
//		Chinese.name = "HH";
//		Chinese.eat();
		
		
		
	}
}



//中国人
class Chinese{
	
	
	String name;
	int age;
	
	static String nation;
	
	
	public void eat() {
		System.out.println("吃");
		this.walk();
	}
	
	public static void show() {
		System.out.println("哈哈哈哈");
		//不能调用非静态结构
//		eat();
//		name = "Tom";
		//可以调用静态结构
		System.out.println(Chinese.nation);
		walk();
	}
	
	public static void walk() {
		
	}
}









