package chapter05;

import java.util.Scanner;

public class Funtest07 {

	
	public static void Edustep(int edu) {
		
		
		
		if(edu==1) {
			System.out.println("���� ���͵� �ܰ�� step1 �Դϴ�.");
		}else if(edu==2) {
			System.out.println("���� ���͵� �ܰ�� step2 �Դϴ�.");			
		}else if(edu==3) {
			System.out.println("���� ���͵� �ܰ�� step3 �Դϴ�.");
			
		}else {
						
		}

	
	}

/*
 * 	
	public static String Edustep(int edu) {
		
		String step;
		
		if(edu==1) {
			step="1�ܰ�";
		}else if(edu==2) {
			step="2�ܰ�";
		}else if(edu==3) {
			step="3�ܰ�";
		}else {
			step="Error";			
		}
		return step;
	}
 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���͵� �ܰ踦 �Է��ϼ��� : ");
		int number=scan.nextInt();
		
		//return���� �ִ°��
		//String step=Edustep(number);
		//System.out.println("���� ���� �ܰ�� : " +step+"�Դϴ�.");
		
		//return���� ���� ���
		Edustep(number);

	}

}
