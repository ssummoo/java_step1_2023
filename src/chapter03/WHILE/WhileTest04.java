package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {

		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Java ������ ������ �Է��ϼ��� : ");
			int scr = scan.nextInt();
			
			//������ 0�̸� �Ǵ� 100�ʰ� while�� ����
			if(scr < 0 || scr>100) {
				break;
			}else if(scr >=60) {
				System.out.println("�հ��ϼ̽��ϴ�.");
			}else {
				System.err.println("���հ� �ϼ̽��ϴ�.");
			}
			
		}
		System.out.println("���α׷� ����");
	}

}
