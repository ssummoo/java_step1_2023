package chapter03.IF;

import java.util.Scanner;

public class If_Example07 {

	public static void main(String[] args) {
		
		//�Է� Scanner Ŭ���� �ʱ�ȭ -> �ν��Ͻ� ������ ����
		
		Scanner scan =new Scanner(System.in);
		//num1 ���
		System.out.print("1. ù��° �� : ");
		double num1 =Double.parseDouble(scan.nextLine());
		System.out.println("ù��° �Է¹��� �� ��� : "+num1);
		System.out.println();
		
		//num2
		System.out.print("2. �ι�° �� : ");
		double num2 =Double.parseDouble(scan.nextLine());
		System.out.println("�ι�° �Է¹��� �� ��� : "+num2);
		System.out.println();
		
		
		
		if(num2 != 0.0) {
			System.out.println("���� �� : "+ num1/num2);
		} else {
			System.out.println("0���� ���� �� �����ϴ�");
			
		}
	} //main
} //class
