package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int num;
		String menu = "";
		
		while(true) {
			System.out.print("1. �Է��ϱ�\n2. ����ϱ�\n3. �����ϱ�\n4. ������\n�۾��� ��ȣ�� �������ּ��� >> ");
			num=scan.nextInt();
			System.out.println();
			
			switch (num) {
			case 1:
				menu="�Է��ϱ�";
				System.out.println(menu+"�� �����ϼ̽��ϴ�.");
				break;
			case 2:
				menu="����ϱ�";
				System.out.println(menu+"�� �����ϼ̽��ϴ�.");
				break;
			case 3:
				menu="�����ϱ�";
				System.out.println(menu+"�� �����ϼ̽��ϴ�.");
				break;
			case 4:
				menu="������";
				System.out.println(menu+"�� �����ϼ̽��ϴ�.");
				System.out.println("���α׷� ����");
				break;

			default:
				System.err.println("�߸��Է��ϼ̽��ϴ�.");
			}//switch
		
			if(num==4) {
				break;
			}
		}//while
		
	}//main

}//class
