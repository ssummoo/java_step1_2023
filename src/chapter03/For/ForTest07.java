package chapter03.For;

import java.util.Scanner;

public class ForTest07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int i;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int a = scan.nextInt();

		// if�� ���ǿ� 0���� ũ�鼭 11���� ���� ��
		if (a > 0 && a < 11) {
			for (i = 1; i <= a; i++) {
				System.out.println("Java ���α׷���!");
			}//for
		} else {
			System.out.println("�Է°��� �߸� �Ǿ����ϴ�.");
		}

			System.out.println("���α׷��� ����˴ϴ�.");
	}

}
