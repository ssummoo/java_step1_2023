package chapter03.Switch;

public class SwitchCase05 {

	public static void main(String[] args) {

		System.out.print("�ֻ��� ���� �� : ");
		int num=(int)(Math.random()*10)+1;
		
		switch (num) {
		//case 1, 2, 3, 4, 5, 6 : //{version 14���� ����
		case 1: case 2: case 3: case 4: case 5: case 6:{
			System.out.println(num+"�� ȹ��");
			
			break;
		}
		default:
			System.out.println("�߸��� �����Դϴ�.");
		}
				
				
	}

}
