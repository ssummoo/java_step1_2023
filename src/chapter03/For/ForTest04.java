package chapter03.For;

public class ForTest04 {

	public static void main(String[] args) {

		// 0 ~ 100������ ���� Ȧ���� ���ϱ�

		int num;
		int total = 0;

		for (num = 0; num <= 100; num++) {
			// ���õǴ� ���๮
			if (num % 2 == 1)
			total += num;
			continue; // pass ����
		}
		System.out.println("1~100���� Ȧ�� ���� �� : " + total);
		System.out.println("===========================");
		System.out.println("1~20������ �� �� Ȧ������ ����Ͻÿ�");

		int odd;
		for (odd = 1; odd <= 20; odd++) {
			if (odd % 2 != 0)
				System.out.print(odd + " ");

		}

	}

}
