package chapter03.For;

import java.util.Scanner;

public class ForTest13 {

	public static void main(String[] args) {
		// ������
		/*
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {//i=2 -> j=1~9
				System.out.println(i+" X "+j+"="+(i*j));
				
		
			}
		System.out.println("------------------------------");

	}
	*/
		Scanner scan=new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� : ");
		int x = scan.nextInt();
		for(int y=1; y<10; y++) {
			System.out.println(x+" X "+y+" = "+(x*y));
		}
}//main
}//class