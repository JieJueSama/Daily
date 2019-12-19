/*
输入两正整数m\n  求其最大公约数和最小公倍数

说明：break关键字的使用：一旦在循环中执行到break，就跳出循环
*/
import java.util.Scanner;

class ForTest{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入第一个正整数");
		int m = scanner.nextInt();
		
		System.out.println("请输入第二个正整数");
		int n = scanner.nextInt();
		
		//获取两的较小值
		int min = (m <= n) ? m : n;
		//公约数
		for(int i = min; i >= 1; i--){
			if(m % i == 0 && n % i == 0){
				System.out.println("最大公约数为"+i);
				break;
			}	
		}
		
		//获取两数的较大值
		int max = (m >= n) ? m : n;
		//公倍数
		for(int i = max; i <= m * n; i++){
			if(i % m == 0 && i % n == 0){
				System.out.println("最小公倍数为" + i);
				break;
			}
		}
	}
	
}