package com.zjx.java3;

import com.zjx.java2.Order;

public class OrderTest {
	
	public static void main(String[] args) {
		
		//不同包下的不同类普通类（非子类），不可以调用生命为private、缺省、protected的属性、方法
		Order order = new Order();
//		order.orderDefault = 1;
//		order.orderProtected = 2;
		order.orderPublic = 3;
		
//		order.methodDefault();
//		order.methodProtected();
		order.methodPublic();
		

//		order.orderPrivate;
//		order.methodPrivate();
	}

}
