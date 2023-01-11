package chapter03.IF;

import javax.swing.JOptionPane; //swing -> 창을 띄움(GUI)

public class If_Example02 {

	public static void main(String[] args) {
		// String  -> int : Integer.parseInt
		
		int dat;
		
		dat=Integer.parseInt(JOptionPane.showInputDialog("값을 입력하세요"));
		
		// 10의 배수를 판단하세요
		// 조건 : dat에 있는 값을 10으로 나눈 나머지가 0이냐
		
		if(dat % 10 == 0)
			System.out.println(dat + "(은)는 10의 배수 입니다.");
		else
			System.out.println(dat + "(은)는 10의 배수가 아닙니다.");
	}

}
