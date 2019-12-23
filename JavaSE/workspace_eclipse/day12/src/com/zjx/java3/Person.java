package com.zjx.java3;

public class Person {

	String name;

	int age;

	int id = 1001;// 身份证号

	public Person() {
		super();
		System.out.println("我无处不在");
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("吃");
	}

	public void walk() {
		System.out.println("走");
	}

}
