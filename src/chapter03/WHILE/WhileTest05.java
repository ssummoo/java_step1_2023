package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int num, cnt=0, sum=0;
		double avg=0;
		
		while(true) {
		//0�� �Է��ϸ� ����
			System.out.print("���ڸ� �Է��ϼ��� : ");
			num = scan.nextInt();
			
			if(num==0) {
				break;
			}
			sum+=num;
			cnt++;
			avg=sum/(double)cnt;
			
		}//while
			System.out.println("�Էµ� ������ ���� : "+cnt);
			System.out.println("�Էµ� ������ ���� : "+sum);
			System.out.println("�Էµ� ������ ��� : "+avg);	
			System.err.println("���α׷� ���� ");
	}// main

}//class
