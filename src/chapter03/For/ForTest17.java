package chapter03.For;

import java.util.Scanner;

public class ForTest17 {

	public static void main(String[] args) {
		// ������ �Է¹޾Ƽ� �Էµ� ����ŭ �����

		Scanner scan = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		/*
		 for (int i = 1; i <= num; i++) {
			for (int j = num - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
	
	
	}
	}
		 */
		for (int i = 0; i < num; i++) {//��üȸ��
			for (int j = 0; j <= num - 1 - i; j++) {//����ȸ��
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {//��ȸ��
				System.out.print("��");
			}
			System.out.println();
		}
	}
}