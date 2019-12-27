package com.zjx.java1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

/*
 * 	try-catch-finally中finally的使用
 * 
 * 
 * 	1. finally是可选的
 * 
 * 	2. finally中声明的是一定会被执行的代码，即使catch中又出现异常了，try中有return语句，catch中有return语句等情况
 * 
 * 	3.向数据库连接、输入输出流、网络编程中的Socket资源，JVM是不能自动的回收，我们需要自己手动的进行资源的释放
 * 																此时的资源释放，就需要声明在finally中
 * 
 * 
 */
public class FinallyTest {
	
	
	@Test
	public void test2() {
		
		FileInputStream fis = null;
		
		try {
			File file = new File("hello1.txt");
			fis = new FileInputStream(file);
			
			int data = fis.read();
			
			while(data != -1) {
				System.out.println((char)data);
				data = fis.read();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	@Test
	public void testMethod() {
		int num = method();
		System.out.println(num);
	}
	
	public int method() {
		try {
			int[] arr = new int[10];
			System.out.println(arr[10]);
			return 1;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			return 2;
		}finally {
			System.out.println("一定会执行，先于上面的return");
			return 3;
		}
	}
	
	@Test
	public void test1() {
		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
			
		}catch(ArithmeticException e) {
//			e.printStackTrace();
			int[] arr = new int[10];
			System.out.println(arr[10]);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("哈哈哈");
		}
		
		System.out.println("heiheihei");
	}

}
