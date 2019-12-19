/*
如何从键盘获取不同类型的变量：需要使用Scanner类


具体实现步骤：
1.导包：import java.util.Scanner;
2.Scanner的实例化：Scanner scan = new Scanner(System.in);
3.调用Scanner类的相关方法(next()/nextXxxx()),来获取指定类型的变量

注意：
需要根据相应的方法，来输入指定类型的变量。
如果输入的数据类型与要求的类型不匹配时，会报异常：InputMisMatchException
导致程序终止


*/
//1.导包：import java.util.Scanner
import java.util.Scanner;


class ScannerTest{
	public static void main(String[] args){
		//2.Scanner的实例
		Scanner scan = new Scanner(System.in);
		
		//3.调用Scanner类的相关方法
		System.out.println("名字");
		String name = scan.next();
		System.out.println(name);
		
		System.out.println("年龄");
		int age = scan.nextInt();
		System.out.println(name);
		
		System.out.println("体重");
		double weight = scan.nextDouble();
		System.out.println(weight);
		
		System.out.println("true/false");
		Boolean isLove = scan.nextBoolean();
		System.out.println(isLove);
		
		System.out.println("性别");
		String gender = scan.next();
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);
		
		
	}
}