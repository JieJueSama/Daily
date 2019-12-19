/*
while循环的使用

一、循环结构的四个要素
1初始化条件
2循环条件 ---》 boolean结构
3循环体
4迭代条件

二、while循环结构

1;
while(2){
	3;
	4;
}
说明：
1.写while循环千万小心不要丢了迭代条件，一旦丢了，就可能导致死循环
2.我们写程序。要避免出现死循环
3.for和while可以相互转换

算法：有限性
*/
class WhileTest{
	public static void main(String[] args){
		
		//遍历100以内所有偶数
		int i = 1;
		while(i <= 100){
			if(i % 2 == 0){
				System.out.println(i);
			}
			i++;
		}
		
	}
}


















