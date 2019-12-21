package com.zjx.java;
/*
 * 
 *  	算法的考查
 *  	数组的复制、反转、查找（线性查找、二分法查找）
 */

public class ArrayTest2 {
	
	public static void main(String[] args) {
		String[] arr = new String[] {"jj","dd","mm","bb","gg","aa"};
		
		//数组的复制
		String[] arr1 = new String[arr.length];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		//数组的反转
		//方式一
//		for(int i = 0 ; i < arr.length / 2; i++ ) {
//			String temp = arr[i];
//			arr[i] = arr[arr.length - i - 1];
//			arr[arr.length - i - 1] = temp;
//		}
		
		//方式二
//		for(int i = 0, j = arr.length - 1; i < j; i++, j-- ) {
//			String temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//		}
		
		//遍历
		for(int i = 0 ; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//查找
		//线性查找
		String dest = "bb";
		boolean isFlag = true;
		for(int i = 0; i < arr.length; i++) {
			if(dest.equals(arr[i])) {
				System.out.println(i);
				isFlag = false;
				break;
			}
		}
		if(isFlag) {
			System.out.println("not found");
		}
		//二分法查找
		//前提，所要查找的数组有序
		int[] arr3 = new int[] {-98,-10,-3,0,2,15,16,18,55};
		
		int dest1 = -3;
		int head = 0;//初始索引
		int end = arr3.length - 1;//初始末索引
		while(head <= end) {
			int middle = (head + end)/2;
			
			if(dest1 == arr3[middle]) {
				System.out.println(middle);
				break;
			}
			else if(arr3[middle] > dest1) {
				end = middle - 1;
			}
			else {
				head = middle + 1;
			}
		}
		
		System.out.println("not found");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
