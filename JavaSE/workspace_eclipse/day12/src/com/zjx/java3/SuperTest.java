package com.zjx.java3;

/*
 * 		super关键字的使用：
 * 			1.super理解为：父类
 * 			2.supe可以用来调用属性、方法、构造器
 * 			3.super的使用：
 * 					我们可以在子类的方法或构造器中，通过使用super.属性   或   super.方法 的方式  显式的调用父类中声明的方法或属性。但是，通常情况下，我们习惯省略 super
 * 					特殊情况下，当子类和父类中定义了同名的属性时，我们要向在子类中调用父类中声明的属性，则必须显式的使用  super.属性 的方式，表明调用的是父类中声明的属性
 * 					特殊情况:当子类重写了父类中的方法以后，我们想在子类的方法中调用父类中被重写的方法时，则必须显式的使用  super.方法 的方式，表明调用的是父类中被重写的方法
 * 
 * 			4.super调用构造器
 * 					我们可以在子类的构造器中显式的使用 super(形参列表) 的当时，调用父类中声明的指定的构造器
 * 					super(形参列表)的使用，必须声明在子类构造器的首行
 * 					我们在类的构造器中，针对于  this(形参列表)	super(形参列表)    只能二选一 不能同时出现
 * 					在构造器的首行，没有显示的声明 this(形参列表)	super(形参列表) 则默认调用的是父类的空参构造器super()
 * 					在类的多个构造器中，至少有一个类的构造器使用了	super(形参列表)   调用了父类的构造器
 * 
 */
public class SuperTest {

	
	public static void main(String[] args) {
		Student s = new Student();
		
		s.show();
		
		s.study();
		
		Student s1 = new Student("Tom", 20, "计算机");
		
		s1.show();
		
		System.out.println("***********");
		
		Student s2 = new Student();
	}
}
