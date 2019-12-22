package com.zjx.java;

public class OrderTest {
	
	public static void main(String[] args) {
		
		
		Order order = new Order();
		
		order.orderDefault = 2;
		order.orderPublic = 4;
		
		//出了Order类之后，私有的结构就不可以调用了
//		order.orderPrivate = 6;
		
		order.methodDeafault();
		order.methodPublic();
		//出了Order类之后，私有的结构就不可以调用了
//		order.methodPrivate();
		
		
	}

}
