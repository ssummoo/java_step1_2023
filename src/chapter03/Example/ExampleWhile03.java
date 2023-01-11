package chapter03.Example;

import java.util.Scanner;

public class ExampleWhile03 {

	public static void main(String[] args) {

		boolean run = true;

		int num, num2, money;
		int save = 0;
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("===============================");
			System.out.println("1.예금 | \t2.출금 | \t3.잔고 | \t4.종료");
			System.out.println("===============================");
			System.out.print("선택 >> ");
			num = scan.nextInt();
			if (num == 1) {
				System.out.println("에금을 선택하셨습니다.");
				System.out.println("현재 잔고 : " + save);
				System.out.print("입금할 금액을 입력하세요 : ");
				money = scan.nextInt();
				save+=money;
				System.out.println("입금후 잔고 : "+ save);
				if (money < 0) 
					System.out.println("금액을 잘못 입력하셨습니다.");				
			} else if (num == 2) {
				System.out.println("출금을 선택하셨습니다.");
				System.out.println("현재 잔고 : " + save);
				System.out.print("출금할 금액을 입력하세요 : ");
				money = scan.nextInt();
				System.out.println("출금 후 잔고 : "+save);
				save -= money;
				if (save < 0) {
					System.out.println("잔액이 부족합니다.");
					save += money;// 잔액이 부족하므로 출금시도했던 금액을 다시 입금
				}
			} else if (num == 3) {
				System.out.println("잔액확인을 선택하셨습니다. ");
				System.out.println("현재 금액 : " + save);

			} else if (num == 4) {
				System.out.println("종료를 선택하셨습니다.");
				run = false;
			} else {
				System.out.println("잘못된 서비스 번호입니다.");
			}
				System.out.println("1.초기메뉴 2.종료");
				num2=scan.nextInt()	;
				if(num2==2) {
					run=false;
				
			}
		}//while
		System.out.println("이용해주셔서 감사합니다.");
	}//main
}//class
