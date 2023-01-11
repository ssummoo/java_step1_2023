package chapter03.For;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		// 정수를 입력받아 입력받은 정수부터 100까지의 합을 출력하시오

		Scanner scan = new Scanner(System.in);

	
		// 1~10까지 반복하면서 정수를 입력받아 그 수중에 짝수의 갯수가 몇개인지 출력
		// 단 입력받은 수가 0이면 무시

		System.out.print("숫자를 입력하시오 : ");
		int a, b, cnt = 0;
		for (b = 1; b <= 10; b++) {
			b = scan.nextInt();
			if (b == 0)
				continue;
			if (b > 11)
				continue;
			if (b % 2 == 0) {
				cnt++;

			}

		}
		System.out.println("입력받은 수의 짝수의 갯수 : " + cnt);

	}

}
