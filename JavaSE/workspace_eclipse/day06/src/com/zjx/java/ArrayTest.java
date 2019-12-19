package com.zjx.java;
/*
 * 
 * 一、数组概述：
 * 1.数组的理解：数组（Array）是多个相同类型的数据按一定顺序排列的集合，并使用一个名字命名
 * 并通过编号的方式对这些数据进行统一管理
 * 
 * 2.数组的相关概念
 * 数组名
 * 元素
 * 角标、下标、索引
 * 数组的长度：元素的个数
 * 
 * 3.数组的特点：
 * 数组是有序排列的
 * 数组属于引用数据类型的变量，数组的元素可以是基本数据类型也可以是引用数据类型
 * 创建数组对象会在内存中开辟一整块连续的空间
 * 数组的长度一旦确定就不能更改
 * 
 * 4.数组的分类
 * 按照维数：一维数组、二维数组
 * 按照数组元素的类型：基本数据类型的数组、引用数据类型元素的数组 
 * 
 * 5.一维数组的使用：
 * 一维数组的声明和初始化
 * 如何调用数组的指定位置的元素
 * 如何获取数组的长度
 * 如何遍历数组
 * 数组元素的默认初始化值  参见ArrayTest1
 * 数组的内存解析 参见ArrayTest1
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		//1.一维数组的声明和初始化
		//1.1静态初始化   数组的初始化和数组元素的赋值同时进行
		int[] ids;//声明
		ids = new int[] {1001,1002,1003,1004};
		//1.2动态初始化 数组的初始化和数组元素的赋值分开进行
		String[] names = new String[5];
		
		//错误写法：
//		int[] arr1 = new int[];
//		int[5] arr1 = new int[];
//		int[] arr1 = new int[3] {1,2,3};
		
		//总结：数组一旦初始化完成，其长度就确定了
		
		
		//2.如何调用数组的指定位置的元素:通过角标方式
		//数组的角标（或索引）从0开始，到数组的长度-1结束
		names[0] = "aa";
		names[1] = "bb";
		names[2] = "cc";
		names[3] = "dd";
		names[4] = "ee";//charAt(0)
//		names[5] = "ff";
		
		//3.如何获取数组的长度
		//属性：length
		System.out.println(names.length);
		System.out.println(ids.length);
		
		//4.如何遍历数组
		for(int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
