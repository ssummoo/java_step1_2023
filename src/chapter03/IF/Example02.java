package chapter03.IF;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		//gender�� F�� �����Դϴ� �׷��� ������ �����Դϴ�.
		//Scanner�� char�Է¹ޱ�
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Gender(M/F) : ");
		
		char gender;
		gender=scan.nextLine().charAt(0);
		
		if (gender == 'F') {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
		System.out.println("----------------------------");
		System.out.println();
		System.out.print("�ֹ��Ͻðڽ��ϱ�?(Y/N) : ");

		char ch;
		ch = scan.nextLine().charAt(0);

		if ((ch == 'Y') || (ch == 'y')) {
			System.out.print("�޴��� �Է��ϼ��� : ");
			String menu = scan.nextLine();
			System.out.println(menu + "��/�� �ֹ� �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("�̿��� �ּż� �����մϴ�.");
		}

		//��, ���ǿ� ���Լ� ���
	}

}
