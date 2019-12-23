package com.zjx.java1;

public class Person {

	String name;

	int age;

	public Person() {

	}

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}
	
	
	public void eat() {
		System.out.println("eat");
	}
	
	public void walk(int distance) {
		System.out.println("走了" + distance);
		show();
		eat();
	}
	
	private void show() {
		System.out.println("人");
	}
	
	public Object info() {
		return null;
	}

}
