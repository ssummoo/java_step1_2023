package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest06 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int num;
		String menu = "";

		do {
			System.out.println("1.�Է��ϱ�");
			System.out.println("2.����ϱ�");
			System.out.println("3.�����ϱ�");
			System.out.println("4.������");
			System.out.print("�۾��� ��ȣ�� �����ϼ���.: ");
			num = scn.nextInt();
			// 1~3 �� ���ý� ���๮
			if (num < 1 || num > 3) {
				if (num == 4) {
					break;
				}
				menu = "�߸��Է��ϼ̽��ϴ�.";
			}
			if (num == 1) {
				menu = "�Է��ϱ⸦ ";
			} else if (num == 2) {
				menu = "����ϱ⸦ ";
			} else if (num == 3) {
				menu = "�����ϱ⸦ ";
			}
			System.out.println(menu + "�����ϼ̽��ϴ�.");
		} while (num != 4);
		System.out.println("\n �����⸦ �����ϼ̽��ϴ�.");
	}

}
