	package chapter03.For;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		// ����� ������ �Է��� ������ ������ �ο����� �Է¹ް� ������ ����� ���Ͻÿ�(��, ����� �Ǽ��� ����Ұ�)
		
		Scanner scan = new Scanner(System.in);
		
		int i, sum=0, cnt=0;
		double avg;
		int score; 
		
		System.out.print("����� �л� ������ �Է¹����ðڽ��ϱ� ? ");
		int stu=scan.nextInt();
		
		for(i=1; i<=stu; i++) {
		System.out.print(i+"��° �л��� ������ �Է��ϼ���");
			score=scan.nextInt();
			cnt++;
			sum+=score;
		}
			avg =sum/cnt;
			System.out.println("�Է��� �л����� ���� : "+sum);
			System.out.println("�Է��� �л����� ��� : "+avg);
			

	}

}
