package com.zjx.java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

import org.junit.Test;

/*
 * 	一、异常体系结构
 * 		java.lang.Throwable
 * 			|--------java.lang.Error：一般不编写针对性代码处理
 * 			|--------java.lang.Exception：可以进行异常处理
 * 				|-------编译时异常（checked）
 * 					|-----IOException
 * 						|-----FileNotFoundException
 * 					|-----ClassNotFoundException
 * 				|-------运行时异常（unchecked）
 * 					|-----NullPointerException
 * 					|-----ArrayIndexOutOfBoundsException
 * 					|-----ClassCastException
 * 					|-----NumberFormatException
 * 					|-----InputMismatchException
 * 					|-----ArithmeticException
 * 
 * 
 * 	常见的异常有哪些，举例说明
 * 
 */

public class ExceptionTest {
	
	//******************************以下是编译时异常******************************
	@Test
	public void test7() throws Exception {
		File file = new File("hello.text");
		FileInputStream fis = new FileInputStream(file);
		
		int data = fis.read();
		
		while(data != -1) {
			System.out.println((char)data);
			data = fis.read();
		}
		
		fis.close();
	}
	
	
	//******************************以下是运行时异常******************************
	
	//NullPointerException
	@Test
	public void test() {	
		int[] arr = null;
		System.out.println(arr[2]);
		
		String str = "abc";
		str = null;
		System.out.println(str.charAt(0));
	}
	
	//IndexOutOfBoundsException
	@Test
	public void test2() {
		//ArrayIndexOutOfBoundsException
		int[] arr = new int[10];
		System.out.println(arr[10]);
		
		//StringIndexOutOfBoundsException
		String str = "abc";
		System.out.println(str.charAt(3));
	}
	
	//ClassCastException
	@Test
	public void test3() {
		Object obj = new Date();
		String str = (String) obj;
	}
	
	//NumberFormatException
	@Test
	public void test4() {
		String str = "123abc";
		Integer.parseInt(str);
	}
	
	//InputMismatchException
	@Test
	public void test5() {
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		System.out.println(score);
		
		scanner.close();
	}
	
	
	//ArithmeticException
	@Test
	public void test6() {
		int a = 10;
		int b = 0;
		System.out.println(a / b);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
