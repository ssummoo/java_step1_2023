package chapter05;

import java.util.Scanner;

public class Method {

	Scanner scan = new Scanner(System.in);
	
	//void makeBread() { // public ��������
	//System.out.println("���� ����ϴ�.");
	//}
	void makeBread(int count) {
		  for(int i=0; i<count; i++) { System.out.println((i+1)+"��° ���� ��������ϴ�."); }
		  System.out.println("��û�Ͻ� "+count+"���� ���� ��� �Ϸ�Ǿ����ϴ�.");
	}
	void makeBread(int count1, String name) {
		for (int i = 0; i < count1; i++) {
			System.out.println((i + 1) + "��° " + name + "���� ��������ϴ�.");
		}
		System.out.println("��û�Ͻ� " + count1 + "���� " + name + "���� ��� �Ϸ�Ǿ����ϴ�.");
	}// m3

	void order() {
		boolean run = true;
		while (run) {
			System.out.println("==============================");
			System.out.println("1. �� ���� ����\t2. ���� ������ ����\t3. ����");
			System.out.print("���� >>>");
			int n = scan.nextInt();
			if (n == 1) {
				System.out.print("�ֹ��� ���� ���� : ");
				int cnt1 = scan.nextInt();
				makeBread(cnt1);
			} else if (n == 2) {
				System.out.print("�ֹ��� ���� ���� : ");
				int cnt2 = scan.nextInt();
				System.out.print("�ֹ��� ���� ���� : ");
				String name = scan.next();
				makeBread(cnt2, name);
			} else if (n == 3) {
				System.out.println("���α׷�����");
				run = false;
			} else {
				System.out.println("�߸��� ��ȣ�Դϴ�.");
				System.out.println("��ȣ�� Ȯ���ϼ���.");
			}

		}
	}
}
