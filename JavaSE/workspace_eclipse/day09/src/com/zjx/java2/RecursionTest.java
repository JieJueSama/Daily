package com.zjx.java2;
/*		
 * 		递归方法的使用
 * 		1.递归方法：一个方法内调用它自身
 * 		2.方法递归包含了一种隐式的循环，它会重复执行某段代码，但这种重复执行无需循环控制。
 * 		递归一定要向已知方向递归，否则这种递归就变成了无穷递归，类似于死循环
 * 
 */
public class RecursionTest {
	
	public static void main(String[] args) {
		
		RecursionTest test = new RecursionTest();
		int sum = test.getSum(100);
		System.out.println(sum);
		
		System.out.println("*******************************");
		
		int value = test.f(10);
		System.out.println(value);
		
		System.out.println("*******************************");
		
		//斐波那契数列
		for(int i = 0; i < 10; i++) {
			System.out.print(test.Fibonacci(i) + " ");
		}
		System.out.println();
	}
	
	//例1： 1 - 100之间所有自然数的和  ---递归
	public int getSum(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n + getSum(n - 1);
		}
	}
	
	//乘法
	public int getSum1(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n * getSum(n - 1);
		}
	}
	
	//已知有一个数列：f(0) = 1, f(1) = 4, f(n+2) = 2 * f(n + 1) + f(n)
	//其中n是大于0的整数，求f(10)的值
	public int f(int n) {
		if(n == 0) {
			return 1;
		}
		else if( n == 1) {
			return 4;
		}
		else {
			return 2 * f(n - 1) + f(n - 2);
		}
	}
	
	
	
	//斐波那契数列
	//1 1 2 3 5 8 13 21 34 55
	//规律：一个数等于前两个数之和
	public int Fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		else {
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}
	
	
	
	
	
	
	
	
	
	
	

}
