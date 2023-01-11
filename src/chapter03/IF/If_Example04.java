package chapter03.IF;

import javax.swing.JOptionPane;

public class If_Example04 {

	public static void main(String[] args) {
		// 전시관의 입장료는 미취학 아동은 1000원
		// 전시관의 입장료는 초등학생은 2000원
		// 전시관의 입장료는 중.고등학생은 3500원
		// 전시관의 입장료는 성인은 5000원

		int age;
		int charge;
		String index;
		
		// swing(나이를 입력하세요) 사용하여 입력 받기

		age = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요."));

		// if
		if (age <= 7) {
			charge = 1000;
			index = "미취학 아동";
			
		} else if (age <= 13) {
			charge = 2000;
			index = "초등학생";
			
		} else if (age <= 19) {
			charge = 3500;
			index ="중고등학생";
			
		} else {
			charge = 5000;
			index = "성인";
		}
		System.out.println(index+"입니다.");
		System.out.println("입장료는 " + charge + "원 입니다.");

	}

}
