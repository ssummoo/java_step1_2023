package chapter03.For;

public class ForTest01 {

	public static void main(String[] args) {
		// 1���� 10������ ��
		/*
		int sum=1;
		
		//sum = sum+2 ;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		sum += 6;
		sum += 7;
		sum += 8;
		sum += 9;
		sum += 10;

		System.out.println(sum);
		*/
		int i;
		System.out.println("1���� 10������ �� ��� ");
		for(i=1; i<=10; i++) {
		System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("=======================");
		
		int j; // index ����
		int sum = 0; // ���������̹Ƿ� �ݵ�� �ʱ�ȭ ����

		for (j = 1; j <= 10; j++) {

			System.out.print(j + "  ");
			sum += j;
		}
		System.out.println();
		System.out.println("1���� 10������ �� : " + sum + "�Դϴ�.");

	}
		
}
