package chapter03.IF;

import java.util.Scanner;


public class If_Example11 {
		
	public static void main(String[] args) {
		// Scanner scan이라는 인스턴스 변수 선언
		
		Scanner scan = new Scanner(System.in);
		
		// ID라는 변수로 아이디 받기
		System.out.print("아이디 : ");
		String ID =scan.nextLine() ;
		// PW라는 변수로 비번 선언(String) -> 숫자로 받되 String
		System.out.print("비밀번호 : ");
		String PW =scan.nextLine() ;
		// int형으로 형변환
		int pass = Integer.parseInt(PW);
		
		if (ID.equals("soldesk") && pass==12345) {
			System.out.println("로그인 성공 !");
		}
		else {
			System.out.println("아이디와 비밀번호를 확인하세요");
		}
		/*
		
		// 중첩질의를 사용하여 로그인 성공과 비밀번호 다름, 아이디 없음
		if (ID.equals(id)) { 
			if (PW.equals(pass)) {
			System.out.println("로그인 성공 !");
		}	 else {
			System.out.println("비밀번호를 확인하세요");
		}
		}	 else {
		 
			System.out.println("존재하지 않는 아이디입니다.");
		}
*/
		
	}	
}
