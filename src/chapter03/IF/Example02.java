package chapter03.IF;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		//gender가 F면 남성입니다 그렇지 않으면 여성입니다.
		//Scanner로 char입력받기
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Gender(M/F) : ");
		
		char gender;
		gender=scan.nextLine().charAt(0);
		
		if (gender == 'F') {
			System.out.println("남성입니다.");
		} else {
			System.out.println("여성입니다.");
		}
		System.out.println("----------------------------");
		System.out.println();
		System.out.print("주문하시겠습니까?(Y/N) : ");

		char ch;
		ch = scan.nextLine().charAt(0);

		if ((ch == 'Y') || (ch == 'y')) {
			System.out.print("메뉴를 입력하세요 : ");
			String menu = scan.nextLine();
			System.out.println(menu + "이/가 주문 완료되었습니다.");
		} else {
			System.out.println("이용해 주셔서 감사합니다.");
		}

		//단, 조건에 논리함수 사용
	}

}
