/*
��֧�ṹ֮��

1.��ʽ
switch(���ʽ){
	
	case ����1
		ִ�����1
		//break;
	
	case ����2
		ִ�����2
		//break;
	.......
	default:
		ִ�����n;
		//break;
}

2.˵����
����switch���ʽ�е�ֵ������ƥ�����case�еĳ�����һ��ƥ��ɹ����������Ӧ��case�ṹ��������ִ�����
��������ִ����������Ȼ��������ִ������case�ṹ�е�ִ�����
ֱ������break�ؼ��ֻ��switch-case�ṹĩβΪֹ


break  ����ʹ����switch-case�ṹ�У�һ�������˹ؼ��֣�������switch-case�ṹ

switch�ṹ�еı��ʽ��ֻ�������µ�6���������ͣ�byte short char int ö������(JDK5.0) String����(JDK7.0)
case֮��ֻ����������������������Χ
break�ؼ����ǿ�ѡ��
default�൱��if-else�е�else  defaultҲ�ǿ�ѡ��λ��Ҳ������


���ǿ���ʹ��switch-case�Ľṹ������ת���if-else
����д��֧�ṹʱ�������ֿ���ʹ��switch-case��switch�б��ʽȡֵ�����̫�ࣩ�ֿ���ʹ��if-else����������ʹ��switch-case
ԭ��switch-caseִ��Ч�ʸ�
*/
class SwitchTest{
	public static void main(String[] args){
		int num = 2;
		switch(num){
			case 0: 
				System.out.println("zero");
				break;
			case 1: 
				System.out.println("one");
				break;
			case 2: 
				System.out.println("two");
				break;
			case 3: 
				System.out.println("three");
				break;
			default:
				System.out.println("other");
		}
		
		
		//***************************************
		//error
		/*
		boolean isHandsome = true;
		
		switch(isHandsome){
			case true:
				System.out.println("456");
			case false:
				System.out.println("5555");
		}
		*/
		
		//error
		/*
		int num = 50;
		int i = 1;
		switch(num){
			case num > 10 :
				System.out.println("10");
		}
		*/
		
		
	}
}