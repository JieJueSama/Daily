package com.zjx.java4;

public class Man extends Person {

	int id = 1002;
	
	boolean isSmoking;
	
	public void earnMoney() {
		System.out.println("挣钱");
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("多吃肉");
	}
	
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("霸气走");
	}
}
