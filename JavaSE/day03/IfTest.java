/*
��֧�ṹ�е�if-else�������жϽṹ��
һ�����ֽṹ
��һ�֣�
if(�������ʽ){
	ִ�б��ʽ1
}

�ڶ��֣���ѡһ
if(�������ʽ){
	ִ�б��ʽ1
}else{
	ִ�б��ʽ2
}

�����֣�nѡһ



*/

class IfTest{
	public static void main(String[] args){
		
		//����1
		int heartBeats = 79;
		if(heartBeats < 60 || heartBeats > 100){
			System.out.println("��һ�����");
		}
		System.out.println("������");
		
		//����2
		int age = 23;
		if(age < 18){
			System.out.println("����Ƭ");
		}
		else{
			System.out.println("���˵�Ӱ");
		}
		
		//����3
		if(age < 0){
			System.out.println("�Ƿ�");
		}
		else if(age < 18){
			System.out.println("������");
		}
		else if(age < 35){
			System.out.println("��׳��");
		}
		else if(age < 60){
			System.out.println("����");
		}
		else if(age < 120){
			System.out.println("����");
		}
		else{
			System.out.println("��");
		}
	}
}