package chapter03.Switch;

import java.util.Scanner;

public class SwitchCase04 {

	public static void main(String[] args) {
		// Scanner 클래스의 인스턴스변수 scan에 값을 입력받음
		// A,a -> 우수고객 / B,b -> 일반회원 / 나머지 -> 고객
		//charAt(0) : String -> char로 변환
		
		Scanner scan = new Scanner(System.in);
		System.out.print("등급을 입력하세요(A,B,C) : ");
		char grade;
		String index;
		
		grade=scan.nextLine().charAt(0);
		//switch로 판단
		
		switch (grade) {
		case 'A':
		case 'a': 
			index = "우수고객";
			break;
		case 'B':
		case 'b':
			index = "일반고객";
			break;

		default:
			index = "고객" ;
					
			
		}//switch
		
		System.out.println(index+"님 환영합니다.");
		
		

	}//main

}//class
