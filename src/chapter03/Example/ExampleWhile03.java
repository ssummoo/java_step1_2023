package chapter03.Example;

import java.util.Scanner;

public class ExampleWhile03 {

	public static void main(String[] args) {

		boolean run = true;

		int num, num2, money;
		int save = 0;
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("===============================");
			System.out.println("1.���� | \t2.��� | \t3.�ܰ� | \t4.����");
			System.out.println("===============================");
			System.out.print("���� >> ");
			num = scan.nextInt();
			if (num == 1) {
				System.out.println("������ �����ϼ̽��ϴ�.");
				System.out.println("���� �ܰ� : " + save);
				System.out.print("�Ա��� �ݾ��� �Է��ϼ��� : ");
				money = scan.nextInt();
				save+=money;
				System.out.println("�Ա��� �ܰ� : "+ save);
				if (money < 0) 
					System.out.println("�ݾ��� �߸� �Է��ϼ̽��ϴ�.");				
			} else if (num == 2) {
				System.out.println("����� �����ϼ̽��ϴ�.");
				System.out.println("���� �ܰ� : " + save);
				System.out.print("����� �ݾ��� �Է��ϼ��� : ");
				money = scan.nextInt();
				System.out.println("��� �� �ܰ� : "+save);
				save -= money;
				if (save < 0) {
					System.out.println("�ܾ��� �����մϴ�.");
					save += money;// �ܾ��� �����ϹǷ� ��ݽõ��ߴ� �ݾ��� �ٽ� �Ա�
				}
			} else if (num == 3) {
				System.out.println("�ܾ�Ȯ���� �����ϼ̽��ϴ�. ");
				System.out.println("���� �ݾ� : " + save);

			} else if (num == 4) {
				System.out.println("���Ḧ �����ϼ̽��ϴ�.");
				run = false;
			} else {
				System.out.println("�߸��� ���� ��ȣ�Դϴ�.");
			}
				System.out.println("1.�ʱ�޴� 2.����");
				num2=scan.nextInt()	;
				if(num2==2) {
					run=false;
				
			}
		}//while
		System.out.println("�̿����ּż� �����մϴ�.");
	}//main
}//class
