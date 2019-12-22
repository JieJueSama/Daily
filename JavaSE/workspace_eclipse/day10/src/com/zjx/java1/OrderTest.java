package com.zjx.java1;

import com.zjx.java.Order;

public class OrderTest {
	
	public static void main(String[] args) {
		
		
		Order order = new Order();
		
		//出了Order类所属包之后，私有的结构、缺省的结构就不可以调用了
//		order.orderDefault = 2;
		order.orderPublic = 4;
		
		//出了Order类之后，私有的结构就不可以调用了
//		order.orderPrivate = 6;
		
		
		//出了Order类所属包之后，私有的结构、缺省的结构就不可以调用了
//		order.methodDeafault();
		order.methodPublic();
		//出了Order类之后，私有的结构就不可以调用了
//		order.methodPrivate();
		
		
	}

}
