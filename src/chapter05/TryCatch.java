package chapter05;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {

		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));

/*
		int res=num1/num2;
		System.out.println(res);
*/
		try {
			System.out.println(num1/num2);//해당작업코드			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");//에러시 수행되어야할 코드
		}//try catch
		System.out.println("Error 후 컴파일 => 프로그램 종료");
	}
	 
	
}
