
class FamilyAccount{
	public static void main(String[] args){
		
		boolean isFlag = true;
		
		//��¼����֧������
		String details = "��֧\t�˻����\t��֧���\t˵	��\n";
		//��ʼ���
		int balance = 10000;
		
		
		while(isFlag){
			
			System.out.println("----------------����----------------\n");
			System.out.println("		1.��֧��ϸ");
			System.out.println("		2.�Ǽ�����");
			System.out.println("		3.�Ǽ�֧��");
			System.out.println("		4.��	��\n");
			System.out.println("		����1-4		");
			
			//��ȡ�û���ѡ��
			char selection = Utility.readMenuSelection();
			switch(selection){
				case '1':
					//System.out.println("1");
					System.out.println("-------------��ǰ��֧��ϸ��¼-------------");
					//System.out.println("��֧\t�˻����\t��֧���\t˵	��\t");
					System.out.println(details);
					System.out.println("------------------------------------------");
					
					break;
				case '2':
					//System.out.println("2");
					System.out.println("����������");
					int money = Utility.readNumber();
					System.out.println("��������˵����");
					String info = Utility.readString();
					
					//����balance
					balance += money;
					
					//��������
					details += ("����\t" + balance + "\t\t" + money + "\t\t" + info + "\n"); 
					
					System.out.println("-----------------�Ǽ����-----------------\n");
					break;
				case '3':
					//System.out.println("3");
					
					System.out.println("����֧�����");
					int moneyEx = Utility.readNumber();
					System.out.println("����֧��˵����");
					String infoEx = Utility.readString();
					
					//����balance
					if(balance >= moneyEx){
						balance -= moneyEx;
						//��������
						details += ("֧��\t" + balance + "\t\t" + moneyEx + "\t\t" + infoEx + "\n"); 
					}else{
						System.out.println("֧�������˻���ȣ�֧��ʧ��");
					}
					
					
					
					
					System.out.println("-----------------�Ǽ����-----------------\n");
					
					
					break;
				case '4':
					//System.out.println("4");
					System.out.print("ȷ���Ƿ��˳���Y/N����");
					char isExit = Utility.readConfirmSelection();
					if(isExit == 'Y'){
						isFlag = false;
					}
					
					break;
			}	
			
			
			
			
			
		}
		
	}
}












