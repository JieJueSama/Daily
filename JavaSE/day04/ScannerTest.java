/*
��δӼ��̻�ȡ��ͬ���͵ı�������Ҫʹ��Scanner��


����ʵ�ֲ��裺
1.������import java.util.Scanner;
2.Scanner��ʵ������Scanner scan = new Scanner(System.in);
3.����Scanner�����ط���(next()/nextXxxx()),����ȡָ�����͵ı���

ע�⣺
��Ҫ������Ӧ�ķ�����������ָ�����͵ı�����
������������������Ҫ������Ͳ�ƥ��ʱ���ᱨ�쳣��InputMisMatchException
���³�����ֹ


*/
//1.������import java.util.Scanner
import java.util.Scanner;


class ScannerTest{
	public static void main(String[] args){
		//2.Scanner��ʵ��
		Scanner scan = new Scanner(System.in);
		
		//3.����Scanner�����ط���
		System.out.println("����");
		String name = scan.next();
		System.out.println(name);
		
		System.out.println("����");
		int age = scan.nextInt();
		System.out.println(name);
		
		System.out.println("����");
		double weight = scan.nextDouble();
		System.out.println(weight);
		
		System.out.println("true/false");
		Boolean isLove = scan.nextBoolean();
		System.out.println(isLove);
		
		System.out.println("�Ա�");
		String gender = scan.next();
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);
		
		
	}
}