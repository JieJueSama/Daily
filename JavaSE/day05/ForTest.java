/*
������������m\n  �������Լ������С������

˵����break�ؼ��ֵ�ʹ�ã�һ����ѭ����ִ�е�break��������ѭ��
*/
import java.util.Scanner;

class ForTest{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�������һ��������");
		int m = scanner.nextInt();
		
		System.out.println("������ڶ���������");
		int n = scanner.nextInt();
		
		//��ȡ���Ľ�Сֵ
		int min = (m <= n) ? m : n;
		//��Լ��
		for(int i = min; i >= 1; i--){
			if(m % i == 0 && n % i == 0){
				System.out.println("���Լ��Ϊ"+i);
				break;
			}	
		}
		
		//��ȡ�����Ľϴ�ֵ
		int max = (m >= n) ? m : n;
		//������
		for(int i = max; i <= m * n; i++){
			if(i % m == 0 && i % n == 0){
				System.out.println("��С������Ϊ" + i);
				break;
			}
		}
	}
	
}