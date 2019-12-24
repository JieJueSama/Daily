package com.zjx.java1;

import java.util.Date;

/*
 * 	Object类中的toString()方法的使用：
 * 
 * 	1.当我们输出一个对象的引用时，实际上就是调用当前对象的toString()方法
 * 	2.Object类中toString()方法的定义
 * 	public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    
    3.像String\Date\File\包装类等都重写了Object类中的toString()方法
    	使得在调用对象的toString()时，返回实体内容的信息
    	
	4.自定义类也可以重写toString()方法，当调用此方法时，也可以返回实体内容
    
 * 
 * 
 */
public class ToStringTest {
	
	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		System.out.println(cust1.toString());//com.zjx.java1.Customer@3c1
		System.out.println(cust1);//com.zjx.java1.Customer@3c1
		
		String str = new String("AA");
		System.out.println(str);//AA
		
		Date date = new Date(45456465L);
		System.out.println(date);
	}

}
