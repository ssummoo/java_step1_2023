package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int num;
		String menu = "";
		
		while(true) {
			System.out.print("1. 입력하기\n2. 출력하기\n3. 삭제하기\n4. 끝내기\n작업할 번호를 선택해주세요 >> ");
			num=scan.nextInt();
			System.out.println();
			
			switch (num) {
			case 1:
				menu="입력하기";
				System.out.println(menu+"를 선택하셨습니다.");
				break;
			case 2:
				menu="출력하기";
				System.out.println(menu+"를 선택하셨습니다.");
				break;
			case 3:
				menu="삭제하기";
				System.out.println(menu+"를 선택하셨습니다.");
				break;
			case 4:
				menu="끝내기";
				System.out.println(menu+"를 선택하셨습니다.");
				System.out.println("프로그램 종료");
				break;

			default:
				System.err.println("잘못입력하셨습니다.");
			}//switch
		
			if(num==4) {
				break;
			}
		}//while
		
	}//main

}//class
