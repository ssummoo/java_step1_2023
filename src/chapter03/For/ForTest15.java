package chapter03.For;

import java.util.Scanner;

public class ForTest15 {

	public static void main(String[] args) {
		// 
		Scanner scan= new Scanner(System.in);
		int i, j;
		System.out.print("���� �Է��ϼ��� : ");
		int a = scan.nextInt();
		System.out.print("�����Է��ϼ��� : ");
		int b = scan.nextInt();
		
		for(i=1; i<=a; i++) {
			for(j=1; j<=b; j++) {
				System.out.print(j*i+" ");
			}
				System.out.println();
		}
		

	}
		
	}


