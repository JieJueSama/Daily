/*
Forѭ���ṹ��ʹ��
һ��ѭ���ṹ���ĸ�Ҫ��
1��ʼ������
2ѭ������ ---�� boolean�ṹ
3ѭ����
4��������


����forѭ���ṹ
for(1;2;4){
	3;
}

ִ�й��̣�1 - 2 - 3 - 4 - 2 - 3 - 4 - 2 
*/
class ForTest{
	public static void main(String[] args){
		
		for(int i = 0; i < 5; i++){
			System.out.println("Hello");
		}
		
		//��ϰ��
		int num = 1;
		for(System.out.println('a'); num <= 3; System.out.println('c'), num++){
			System.out.println('b');
		}
		//������: 
		/*
		a
		b
		c
		b
		c
		b
		c
		*/
		
		//����100����ż��
		for(int i = 0; i < 100; i+=2){
			System.out.println(i);
		}
	
		
	}
}











