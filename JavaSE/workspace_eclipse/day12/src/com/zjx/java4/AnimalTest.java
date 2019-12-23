package com.zjx.java4;


//多态性的使用  举例一
public class AnimalTest {
	
	public static void main(String[] args) {
		
		AnimalTest test = new AnimalTest();
		
		test.func(new Dog());
		
		
		test.func(new Cat());
		
	}
	
	public void func(Animal animal) {
		animal.eat();
		animal.shot();
	}

}


class Animal{
	
	public void eat() {
		System.out.println("动物吃");
	}
	
	public void shot() {
		System.out.println("动物叫");
	}
}

class Dog extends Animal{
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃");
	}
	
	@Override
	public void shot() {
		// TODO Auto-generated method stub
		System.out.println("狗叫");
	}
}

class Cat extends Animal{
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃");
	}
	
	@Override
	public void shot() {
		// TODO Auto-generated method stub
		System.out.println("猫叫");
	}
}
