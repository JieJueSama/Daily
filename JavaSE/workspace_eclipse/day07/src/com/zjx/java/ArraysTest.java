package com.zjx.java;

import java.util.Arrays;

/*
 * 
 * 	arrays操作数组的工具类
 */
public class ArraysTest {
	
	public static void main(String[] args) {
		
		//equals
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {2,3,1,4};
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.println(isEquals);
		
		//toString
		System.out.println(Arrays.toString(arr1));
		
		//fill
		Arrays.fill(arr1, 10);
		System.out.println(Arrays.toString(arr1));
		
		//sort
		Arrays.sort(arr1);
		
		//binarySearch
		int index = Arrays.binarySearch(arr1, 99);
		if(index > 0) {
			System.out.println(index);
		}
		else {
			System.out.println("not found");
		}
	}

}
