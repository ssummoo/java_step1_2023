package chapter03.Switch;

public class SwitchCase06 {

	public static void main(String[] args) {
		// ���� 9 ~ ���� 6
		
		int time=(int)(Math.random()*10)+9;
		System.out.println("[����ð� : "+time+"��]");
		System.out.print("�� �� : ");
		switch (time) {
		case 9 : case 10 : case 11 : case 12 :
			System.out.println("�������");			
			break;
		case 13 : 
			System.out.println("�Ļ�ð�");
			break;
		case 14 :
			System.out.println("����");
			break;
		case 15: case 16 : case 17:
			System.out.println("���ļ���");
			break;
			
		default:
			System.out.println("�����ϱ�");
		}
	}

}
