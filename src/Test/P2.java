package Test;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		int num, stu=0, sum = 0, max = 0;
		int score[] = null;
		double avg = 0;

		while (run) {
			System.out.println("==============================================");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4. �м� | 5.���� ");
			System.out.println("----------------------------------------------");
			System.out.print("��ȣ�� �Է��ϼ��� >> ");
			num = sc.nextInt();
			if (num <= 0 || num > 5) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} else if (num == 1) {
				System.out.print("�л��� : ");
				stu = sc.nextInt();
				score=new int[stu];
				
			} else if (num == 2) {
				for (int i = 0; i < score.length; i++) {
					System.out.print((i+1)+"�� �л��� ���� :");
					score[i] = sc.nextInt();
				} // f
			} else if (num == 3) {
				for (int i = 0; i < score.length; i++) {
					System.out.println((i+1) + "�� �л��� ���� : " + score[i]);
				} // f
			} else if (num == 4) {
				for (int i = 0; i < score.length; i++) {
					sum += score[i];
					if (max <= score[i]) {
						max = score[i];
					}
				} // f
				avg = sum / (double)stu;
				System.out.println("�ְ����� : " + max);
				System.out.println("���� : " + sum);
				System.out.println(String.format("��� : %.2f",avg));
			} else if (num == 5) {
				run = false;
			}

		} // w
		System.out.println("�̿����ּż� �����մϴ�.");

	}// m

}
