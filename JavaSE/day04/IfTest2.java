/*
键盘三个整数  num1 num2 num3
对他们进行排序（使用if-else）从小到大排序
*/

import java.util.Scanner;

class IfTest2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入第一个整数：");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个整数：");
		int num2 = scanner.nextInt();
		System.out.println("请输入第三个整数：");
		int num3 = scanner.nextInt();
		
		if(num1 > num2){
			if(num3 >= num1){
				System.out.println(num2 + "," + num1 + "," + num3);
			}else if(num3 <= num2){
				System.out.println(num3 + "," + num2 + "," + num1);
			}else{
				System.out.println(num2 + "," + num3 + "," + num1);
			}
		}else{
			if(num3 >= num2){
				System.out.println(num1 + "," + num2 + "," + num3);
			}else if(num3 <= num1){
				System.out.println(num3 + "," + num1 + "," + num2);
			}else{
				System.out.println(num1 + "," + num3 + "," + num2);
			}
		}
		
		//获取一个随机数 10 - 99
		int value = (int)(Math.random() * 90 + 10);
		System.out.println(value);
		//公式：[a,b] : (int)(Math.random() * (b - 1 + 1) + a)
		
	}
}











