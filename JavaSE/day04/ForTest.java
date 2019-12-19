/*
For循环结构的使用
一、循环结构的四个要素
1初始化条件
2循环条件 ---》 boolean结构
3循环体
4迭代条件


二、for循环结构
for(1;2;4){
	3;
}

执行过程：1 - 2 - 3 - 4 - 2 - 3 - 4 - 2 
*/
class ForTest{
	public static void main(String[] args){
		
		for(int i = 0; i < 5; i++){
			System.out.println("Hello");
		}
		
		//练习：
		int num = 1;
		for(System.out.println('a'); num <= 3; System.out.println('c'), num++){
			System.out.println('b');
		}
		//输出结果: 
		/*
		a
		b
		c
		b
		c
		b
		c
		*/
		
		//遍历100以内偶数
		for(int i = 0; i < 100; i+=2){
			System.out.println(i);
		}
	
		
	}
}











