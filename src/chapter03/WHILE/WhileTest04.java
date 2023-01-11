package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest04 {

	public static void main(String[] args) {

		while(true) {
			Scanner scan=new Scanner(System.in);
			System.out.print("Java 교과목 점수를 입력하세요 : ");
			int scr = scan.nextInt();
			
			//점수가 0미만 또는 100초과 while문 중지
			if(scr < 0 || scr>100) {
				break;
			}else if(scr >=60) {
				System.out.println("합격하셨습니다.");
			}else {
				System.err.println("불합격 하셨습니다.");
			}
			
		}
		System.out.println("프로그램 종료");
	}

}
