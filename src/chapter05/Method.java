package chapter05;

import java.util.Scanner;

public class Method {

	Scanner scan = new Scanner(System.in);
	
	//void makeBread() { // public 생략가능
	//System.out.println("빵을 만듭니다.");
	//}
	void makeBread(int count) {
		  for(int i=0; i<count; i++) { System.out.println((i+1)+"번째 빵을 만들었습니다."); }
		  System.out.println("요청하신 "+count+"개의 빵이 모두 완료되었습니다.");
	}
	void makeBread(int count1, String name) {
		for (int i = 0; i < count1; i++) {
			System.out.println((i + 1) + "번째 " + name + "빵을 만들었습니다.");
		}
		System.out.println("요청하신 " + count1 + "개의 " + name + "빵이 모두 완료되었습니다.");
	}// m3

	void order() {
		boolean run = true;
		while (run) {
			System.out.println("==============================");
			System.out.println("1. 빵 갯수 선택\t2. 빵의 갯수와 종류\t3. 종료");
			System.out.print("선택 >>>");
			int n = scan.nextInt();
			if (n == 1) {
				System.out.print("주문할 빵의 갯수 : ");
				int cnt1 = scan.nextInt();
				makeBread(cnt1);
			} else if (n == 2) {
				System.out.print("주문할 빵의 갯수 : ");
				int cnt2 = scan.nextInt();
				System.out.print("주문할 빵의 종류 : ");
				String name = scan.next();
				makeBread(cnt2, name);
			} else if (n == 3) {
				System.out.println("프로그램종료");
				run = false;
			} else {
				System.out.println("잘못된 번호입니다.");
				System.out.println("번호를 확인하세요.");
			}

		}
	}
}
