package chapter03.For;

import java.util.Scanner;

public class ForTest08 {

	public static void main(String[] args) {
		// 10���� ������ �Է¹޾� 3�� ����� 5�� ����� ���� ����Ͻÿ�
		Scanner scan=new Scanner(System.in);	
		int a, b, cnt3=0, cnt5=0 ;
		System.out.print("������ �Է��ϼ��� : ");

		for (a = 1; a <= 10; a++) {
			b = scan.nextInt();
			
			if (b % 3 == 0) {
				cnt3++;
			}
			if (b % 5 == 0) {
				cnt5++;
			}
			
		}
		System.out.println("3�� ����� �� : " + cnt3+"��");
		System.out.println("5�� ����� �� : " + cnt5+"��");
	}
}
