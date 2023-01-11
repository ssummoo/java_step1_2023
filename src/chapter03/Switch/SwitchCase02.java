package chapter03.Switch;

import javax.swing.JOptionPane;

public class SwitchCase02 {

	public static void main(String[] args) {
		// 1: 에금조회 2:출금 3:입금 :4송금 그외 : 번호를 잘못 입력하셨습니다.
		
		int num;
		String message;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("번호를 입력하세요."));

		switch (num) {
		case 1:
			message = "예금조회";
			break;
		case 2:
			message = "출금";
			break;
		case 3:
			message = "입금";
			break;
		case 4:
			message = "송금";
			break;
		default:
			message = "번호를 잘못 입력하셨습니다.";
			break;
		}//switch
			System.out.println(message)	;
	}//main

}//class
