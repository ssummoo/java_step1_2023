package chapter05;

import javax.swing.JOptionPane;

public class FunTest01 {

	//합계 Method(함수)
	//접근지정자 /종류 : public(공용/제한없음), protected(package 공용), private(class)  
	//void : return 없음 

		
	
	//main=> 실행 담당 메소드
	public static void main(String[] args) {
		// 
		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("값1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("값2"));
		
		sum(a,b);
		
	
		
	}//main
//메인을 기준으로 하여 메인 선언 전 또는 후에 정의해도 됨
	public static void sum(int num1, int num2) {
		/*
		int num1=3;
		int num2=5;
		 */
		int total=num1+num2;
		System.out.println(total);
	}
}
