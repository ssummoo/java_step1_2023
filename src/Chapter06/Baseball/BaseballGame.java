package Chapter06.Baseball;

import java.util.Scanner;

public class BaseballGame {

	public int user1, user2, user3;
	public String check = "";

	public BaseballGame() {

		Baseball obj = new Baseball();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("==1~9 사이의 수를 입력하세요==");
			System.out.print("첫번째 수를 입력하세요 : ");
			user1 = scan.nextInt(); // 사용자가 준비한 수
			System.out.print("두번째 수를 입력하세요 : ");
			user2 = scan.nextInt();
			System.out.print("세번째 수를 입력하세요 : ");
			user3 = scan.nextInt();

			int strike = 0;
			int ball = 0;

			// com1과 user1 같으면 S / com2 com3과 user1이 같으면 B
			if (user1 == obj.getCom1()) {
				strike++;
			} else if (user1 == obj.getCom2() || user1 == obj.getCom3()) {
				ball++;
			}
			if (user2 == obj.getCom2()) {
				strike++;
			} else if (user2 == obj.getCom1() || user2 == obj.getCom3()) {
				ball++;
			}
			if (user3 == obj.getCom3()) {
				strike++;
			} else if (user3 == obj.getCom2() || user3 == obj.getCom1()) {
				ball++;
			}
			if (strike == 3) {
				System.out.println("정답 !\t" + obj.getCom1() + obj.getCom2() + obj.getCom3());
				check = "WIN";
			} else {
				if (strike > 0 || ball > 0) {
					System.out.println(strike + "S " + ball + "B");
				} else {
					System.out.println("OUT");
					System.out.println("===============");
				}
			}
		} // while
	}

}
