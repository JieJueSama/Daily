/*
do-whileѭ����ʹ��
һ��ѭ���ṹ���ĸ�Ҫ��
1��ʼ������
2ѭ������ ---�� boolean�ṹ
3ѭ����
4��������

����do-while��ѭ���ṹ

1;
do{
	3;
	4;
}while(2);

1 - 3 - 4 - 2 - 3 - 4 - 2
do-while��������һ��
*/

class DoWhileTest{
	public static void main(String[] args){
		
		//����100���ڵ�ż��
		int num = 1;
		do{
			if(num % 2 == 0){
				System.out.println(num);
			}
			
			num ++;
		}while(num <= 100);
		
	}
}












