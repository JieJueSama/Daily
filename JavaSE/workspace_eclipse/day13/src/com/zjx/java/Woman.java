package com.zjx.java;

public class Woman extends Person {

	
	boolean isBeauty;
	
	public void goShopping() {
		System.out.println("买东西");
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("少吃减肥");
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("窈窕走");
	}
}
