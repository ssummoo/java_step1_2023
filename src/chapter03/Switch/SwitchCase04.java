package chapter03.Switch;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		// Scanner Ŭ������ �ν��Ͻ����� scan�� ���� �Է¹���
		// A,a -> ����� / B,b -> �Ϲ�ȸ�� / ������ -> ��
		//charAt(0) : String -> char�� ��ȯ
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����� �Է��ϼ���(A,B,C) : ");
		char grade;
		String index;
		
		grade=scan.nextLine().charAt(0);
		//switch�� �Ǵ�
		
		switch (grade) {
		case 'A':
		case 'a': 
			index = "�����";
			break;
		case 'B':
		case 'b':
			index = "�Ϲݰ�";
			break;

		default:
			index = "��" ;
					
			
		}//switch
		
		System.out.println(index+"�� ȯ���մϴ�.");
		
		

	}//main

}//class
