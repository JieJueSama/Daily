/*
����
һ�������ǡ�õ�����������֮�ͣ�������ͽ�������
Ex:6=3+2+1

1000���ڵ�����
*/
class PerfectNumber{
	public static void main(String[] args){
		
		
		for(int i = 0; i <= 1000; i++){
			//�����������Ҫ����
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