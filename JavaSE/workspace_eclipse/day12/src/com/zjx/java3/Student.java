package com.zjx.java3;

import com.zjx.java3.Person;

public class Student extends Person {
	
	String major;
	
	int id = 1002;//学号
	
	

	public Student() {
		super();
	}



	public Student(String major) {
		super();
		this.major = major;
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("有营养");
	}
	
	
	public void study() {
		System.out.println("学习");
		this.eat();
		super.eat();
		super.walk();
	}
	
	public void show() {
		System.out.println(this.name + "-" + super.age);
		System.out.println("ïd = " + this.id);
		System.out.println("ïd = " + super.id);
	} 
	
	

}
