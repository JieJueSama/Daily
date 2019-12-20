package com.zjx.java;

/*
 * 求数值型数组中元素的最大值、最小值、平均数、总和等
 * 
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数
 * 然后求出所有元素的最大值、最小值、和值、平均值，并输出出来
 * 要求：所有随机数都是两位数
 * 
 * [10,99]
 * 公式(int)(Math.random() * (99 - 10 + 1) + 10)
 */
public class ArrayTest {

	public static void main(String[] args) {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 最大值
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("数组最大值是" + max);

		// 最小值
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("数组最小值是" + min);
		
		//数组之和
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("数组之和是" + sum);
		//平均值
		System.out.println("数组平均值是" + (sum/arr.length));
	}

}
