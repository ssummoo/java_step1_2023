package Chapter06.Baseball;

import java.util.Scanner;

public class BaseballGame {

	public int user1, user2, user3;
	public String check = "";

	public BaseballGame() {

		Baseball obj = new Baseball();
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("==1~9 ������ ���� �Է��ϼ���==");
			System.out.print("ù��° ���� �Է��ϼ��� : ");
			user1 = scan.nextInt(); // ����ڰ� �غ��� ��
			System.out.print("�ι�° ���� �Է��ϼ��� : ");
			user2 = scan.nextInt();
			System.out.print("����° ���� �Է��ϼ��� : ");
			user3 = scan.nextInt();

			int strike = 0;
			int ball = 0;

			// com1�� user1 ������ S / com2 com3�� user1�� ������ B
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
				System.out.println("���� !\t" + obj.getCom1() + obj.getCom2() + obj.getCom3());
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
