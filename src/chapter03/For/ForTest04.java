package chapter03.For;

public class ForTest04 {

	public static void main(String[] args) {

		// 0 ~ 100까지의 수중 홀수만 합하기

		int num;
		int total = 0;

		for (num = 0; num <= 100; num++) {
			// 무시되는 수행문
			if (num % 2 == 1)
			total += num;
			continue; // pass 무시
		}
		System.out.println("1~100까의 홀수 값의 합 : " + total);
		System.out.println("===========================");
		System.out.println("1~20까지의 수 중 홀수값만 출력하시오");

		int odd;
		for (odd = 1; odd <= 20; odd++) {
			if (odd % 2 != 0)
				System.out.print(odd + " ");

		}

	}

}
