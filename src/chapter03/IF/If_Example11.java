package chapter03.IF;

import java.util.Scanner;


public class If_Example11 {
		
	public static void main(String[] args) {
		// Scanner scan�̶�� �ν��Ͻ� ���� ����
		
		Scanner scan = new Scanner(System.in);
		
		// ID��� ������ ���̵� �ޱ�
		System.out.print("���̵� : ");
		String ID =scan.nextLine() ;
		// PW��� ������ ��� ����(String) -> ���ڷ� �޵� String
		System.out.print("��й�ȣ : ");
		String PW =scan.nextLine() ;
		// int������ ����ȯ
		int pass = Integer.parseInt(PW);
		
		if (ID.equals("soldesk") && pass==12345) {
			System.out.println("�α��� ���� !");
		}
		else {
			System.out.println("���̵�� ��й�ȣ�� Ȯ���ϼ���");
		}
		/*
		
		// ��ø���Ǹ� ����Ͽ� �α��� ������ ��й�ȣ �ٸ�, ���̵� ����
		if (ID.equals(id)) { 
			if (PW.equals(pass)) {
			System.out.println("�α��� ���� !");
		}	 else {
			System.out.println("��й�ȣ�� Ȯ���ϼ���");
		}
		}	 else {
		 
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
		}
*/
		
	}	
}
