package chapter05;

import javax.swing.JOptionPane;

public class FunTest02 {

	
	//�հ� Method(�Լ�)
	//���������� /���� : public(����/���Ѿ���), protected(package ����), private(class)  
	//void : return ���� 
	public static void sum(int num1, int num2) {
		/*
		int num1=3;
		int num2=5;
		 */
		int total=num1+num2;
		System.out.println(total);

		
	}
	
	//main=> ���� ��� �޼ҵ�
	public static void main(String[] args) {
		// 
		int a, b;
		a=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("��2"));
		//static���� ȣ����� �ʾ����Ƿ� Error�߻�
		//sum(a,b);
		
	}//main
//������ �������� �Ͽ� ���� ���� �� �Ǵ� �Ŀ� �����ص� ��
}
