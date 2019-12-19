/*
输出100以内的质数
实现方式二
*/

class PrimeNumberTest2{
	public static void main(String[] args){
		
		label : for(int i = 2; i <= 100; i++){
			boolean flag = true;
			for(int j = 2; j <= Math.sqrt(i); j++){
				if(i % j == 0){
					flag = false;
					continue label;
				}
			}
			if(flag){
				System.out.println(i);
			}
		}
	}
}