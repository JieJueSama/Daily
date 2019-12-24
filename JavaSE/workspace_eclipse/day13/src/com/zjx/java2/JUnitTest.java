package com.zjx.java2;

import java.util.Date;

import org.junit.Test;

/*
 * 	Java中的JUnit单元测试
 * 
 * 	1.步骤：选中当前工程  build path - add libraries - JUnit 4 - 下一步
 * 	2.创建Java类，进行单元测试
 * 		此时的Java类要求：1.此类事public，此类提供公共无参的构造器
 * 	3.此类中声明单元测试方法
 * 		此时的单元测试方法，方法的权限是public，没形参，没返回值
 * 	4.此单元测试方法上需要声明注解：@Test，并在单元测类中导入：import org.junit.Test;
 * 
 * 	5.声明好单元测试方法以后，就可以在方法体内测试相关代码
 * 	6.写完代码后  左键双击单元测试方法   右键  run as
 * 
 * 	没有异常绿条
 * 	异常 红条
 * 
 */
public class JUnitTest {

	int num = 10;
	
	@Test
	public void testEquals() {
		
		String s1 = "MM";
		String s2 = "MM";
		System.out.println(s1.equals(s2));
		
//		Object obj = new String("GG");
//		Date date = (Date)obj;
		
		System.out.println(num);
		show();
		
	}
	
	
	public void show() {
		System.out.println("show......");
	}
	
	
	@Test
	public void testToString() {
		
		String s1 = "MM";
		String s2 = "MM";
		System.out.println(s1.equals(s2));
		
//		Object obj = new String("GG");
//		Date date = (Date)obj;
		
		System.out.println(num);
		show();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
