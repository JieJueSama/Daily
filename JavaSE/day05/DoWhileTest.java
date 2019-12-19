/*
do-while循环的使用
一、循环结构的四个要素
1初始化条件
2循环条件 ---》 boolean结构
3循环体
4迭代条件

二、do-while的循环结构

1;
do{
	3;
	4;
}while(2);

1 - 3 - 4 - 2 - 3 - 4 - 2
do-while至少运行一次
*/

class DoWhileTest{
	public static void main(String[] args){
		
		//遍历100以内的偶数
		int num = 1;
		do{
			if(num % 2 == 0){
				System.out.println(num);
			}
			
			num ++;
		}while(num <= 100);
		
	}
}












