package chapter05;

import javax.swing.JOptionPane;

public class TryCatch {

	public static void main(String[] args) {

		int num1, num2;
		
		num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("��2"));

/*
		int res=num1/num2;
		System.out.println(res);
*/
		try {
			System.out.println(num1/num2);//�ش��۾��ڵ�			
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");//������ ����Ǿ���� �ڵ�
		}//try catch
		System.out.println("Error �� ������ => ���α׷� ����");
	}
	 
	
}
