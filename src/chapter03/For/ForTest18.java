package chapter03.For;

import java.util.Scanner;

public class ForTest18 {

	public static void main(String[] args) {

		// ������ �Է¹޾Ƽ� �Էµ� ����ŭ �� ���
		Scanner scan = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ��� : ");
		int i, j, k;
		int num = scan.nextInt();

		for(i=1;i<=num;i++) {
			for(j=1; j<=i; j++) {
			System.out.print("��");
		}
		System.out.println();
		}
	}

}
