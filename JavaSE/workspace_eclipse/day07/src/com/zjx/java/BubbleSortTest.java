package com.zjx.java;
/*
 * 
 * 	数组的冒泡排序的实现
 */
public class BubbleSortTest {
	 
	public static void main(String[] args) {
		
		int[] arr = new int[] {21,3,45,66,32,44,77,616,708};
		
		//冒泡排序
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
	

}
