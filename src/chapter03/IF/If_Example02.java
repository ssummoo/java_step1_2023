package chapter03.IF;

import javax.swing.JOptionPane; //swing -> â�� ���(GUI)

public class If_Example02 {

	public static void main(String[] args) {
		// String  -> int : Integer.parseInt
		
		int dat;
		
		dat=Integer.parseInt(JOptionPane.showInputDialog("���� �Է��ϼ���"));
		
		// 10�� ����� �Ǵ��ϼ���
		// ���� : dat�� �ִ� ���� 10���� ���� �������� 0�̳�
		
		if(dat % 10 == 0)
			System.out.println(dat + "(��)�� 10�� ��� �Դϴ�.");
		else
			System.out.println(dat + "(��)�� 10�� ����� �ƴմϴ�.");
	}

}
