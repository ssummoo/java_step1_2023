package chapter04;

import javax.swing.JOptionPane;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String student[]=new String[2];
		String phone[]=new String[2];
		
		for(int i=0; i<student.length; i++) {
			
			student[i]=JOptionPane.showInputDialog("�̸�");
			phone[i]=JOptionPane.showInputDialog("��ȭ��ȣ");
			
			System.out.println("�̸� : "+student[i]+"\t��ȭ��ȣ : "+phone[i]);
			
			
		}// for
				
	}//main

}//class
