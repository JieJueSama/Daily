/*
完数
一个数如果恰好等于它的因子之和，这个数就叫做完数
Ex:6=3+2+1

1000以内的完数
*/
class PerfectNumber{
	public static void main(String[] args){
		
		
		for(int i = 0; i <= 1000; i++){
			//不放里面就需要重置
			int factor = 0;
			
			for(int j = 1 ; j < i; j++){
				if(i % j == 0){
					factor += j;
				}
			}
			if(i == factor){
				System.out.println(i);
			}
		}
	}
}