package com.zjx.java8;

public class SubClassTest {

	
	public static void main(String[] args) {
		
		SubClass s = new SubClass();
		
//		s.method1();
//		SubClass.method1();
		//知识点1：接口中定义的静态方法，只能通过接口来调用
		CompareA.method1();
		
		//知识点2：通过实现类的对象，可以调用接口中的默认方法
		//如果实现类重写了接口中的默认方法，调用时，仍然调用的是重写以后的方法
		s.method2();
		//知识点3：如果子类（或实现类）继承的父类和实现的接口中，声明了同名同参数的方法，
		//子类在没有重写此方法的前提下，默认调用的是父类中的同名同参数方法 ---> 类优先原则
		//知识点4：如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法
		//那么在实现类没有重写此方法的情况下，报错 --->接口冲突
		s.method3();
		
		
	}
}

class SubClass extends SuperClass  implements CompareA, CompareB{
	
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("subclass method2");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("subclass method3.....");
	}
	
	//知识点5：如何在子类（或实现类）的方法中调用父类、接口中被重写的方法
	public void myMethod() {
		method3();//自己定义的重写的方法
		super.method3();//调用的是父类中声明的方法
		//调用接口中的默认方法
		CompareA.super.method3();
		CompareB.super.method3();
	}
	
}
