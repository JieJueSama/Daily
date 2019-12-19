/*
练习：随意给出一个三位数的整数，打印显示它的个位数，十位数，百位数的值。
格式如下：
数字xxx的情况如下：
个位数：
十位数：
百位数：

例如：
数字153的情况如下：
个位数：3
十位数：5
百位数：1

*/

class AriExer{
	public static void main(String[] args){
		int num  = 187;
		
		int bai = 187 / 100;
		int shi = 187 % 100 / 10;
		//int shi = 187 / 10 % 10;
		int ge = num % 10;
		
		System.out.println("百位：" + bai + ",十位：" + shi + ",个位：" + ge);
		
		
	}
}





















