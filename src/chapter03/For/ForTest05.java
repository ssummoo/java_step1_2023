package chapter03.For;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		// ������ �Է¹޾� �Է¹��� �������� 100������ ���� ����Ͻÿ�

		Scanner scan = new Scanner(System.in);

	
		// 1~10���� �ݺ��ϸ鼭 ������ �Է¹޾� �� ���߿� ¦���� ������ ����� ���
		// �� �Է¹��� ���� 0�̸� ����

		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int a, b, cnt = 0;
		for (b = 1; b <= 10; b++) {
			b = scan.nextInt();
			if (b == 0)
				continue;
			if (b > 11)
				continue;
			if (b % 2 == 0) {
				cnt++;

			}

		}
		System.out.println("�Է¹��� ���� ¦���� ���� : " + cnt);

	}

}
