package chapter03.IF;

import java.util.Scanner;

public class If_Example12 {

	public static void main(String[] args) {
		// �����ͺ��̽�
		String ID = "soldesk";
		int PW = 221227;

		// Scanner scan �ν�ź�� ����
		Scanner scan = new Scanner(System.in);

		// ID�ޱ�
		System.out.print("ID : ");
		String inputID = scan.nextLine();

		if (ID.equals(inputID)) {
			// ����Է� �ް�
			System.out.print("PW : ");
			String inputPW = scan.nextLine();
			// ���Ȯ�� �ڵ�
			if (PW == Integer.parseInt(inputPW)) {
				System.out.println("�α��� ���� !");
			} else {
				System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}//main
}//class
