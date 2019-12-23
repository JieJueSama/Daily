package com.zjx.java;

public class Person extends Creature {

	String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	private void sleep() {
		System.out.println("睡觉");
	}

	public void eat() {
		System.out.println("吃饭");
		sleep();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
