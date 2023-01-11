package chapter03.For;

import java.util.Scanner;

public class ForTest17 {

	public static void main(String[] args) {
		// 정수를 입력받아서 입력된 수만큼 ★출력

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		/*
		 for (int i = 1; i <= num; i++) {
			for (int j = num - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("☆");
			}
			System.out.println();
		}
	
	
	}
	}
		 */
		for (int i = 0; i < num; i++) {//전체회전
			for (int j = 0; j <= num - 1 - i; j++) {//공백회수
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {//★회수
				System.out.print("★");
			}
			System.out.println();
		}
	}
}