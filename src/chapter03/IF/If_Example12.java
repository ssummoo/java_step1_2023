package chapter03.IF;

import java.util.Scanner;

public class If_Example12 {

	public static void main(String[] args) {
		// 데이터베이스
		String ID = "soldesk";
		int PW = 221227;

		// Scanner scan 인스탄스 변수
		Scanner scan = new Scanner(System.in);

		// ID받기
		System.out.print("ID : ");
		String inputID = scan.nextLine();

		if (ID.equals(inputID)) {
			// 비번입력 받고
			System.out.print("PW : ");
			String inputPW = scan.nextLine();
			// 비번확인 코드
			if (PW == Integer.parseInt(inputPW)) {
				System.out.println("로그인 성공 !");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}//main
}//class
