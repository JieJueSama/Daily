/*
������������  num1 num2 num3
�����ǽ�������ʹ��if-else����С��������
*/

import java.util.Scanner;

class IfTest2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������һ��������");
		int num1 = scanner.nextInt();
		System.out.println("������ڶ���������");
		int num2 = scanner.nextInt();
		System.out.println("�����������������");
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
		
		//��ȡһ������� 10 - 99
		int value = (int)(Math.random() * 90 + 10);
		System.out.println(value);
		//��ʽ��[a,b] : (int)(Math.random() * (b - 1 + 1) + a)
		
	}
}











