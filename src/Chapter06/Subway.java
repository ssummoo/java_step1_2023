package Chapter06;

public class Subway {

	//�������
	public String lineNumber;
	int passengerCount;
	int money;
	
	//����Ʈ ������ ����
	
	public Subway(String lineNumber) {
		this.lineNumber=lineNumber;	
	}
	public void take(int money) {//�°��� �� �� 
		this.money+=money; //����ö ���� ����
		passengerCount++;// �°� ��
		
	}
	public void showInfo() { //������ ������ ���	
		System.out.println("����ö "+lineNumber+"�� �°���"+passengerCount+"���̰�, ������ "+money+"�� �Դϴ�.");
		
	}
}


