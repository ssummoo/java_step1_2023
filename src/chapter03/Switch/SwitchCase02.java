package chapter03.Switch;

import javax.swing.JOptionPane;

public class SwitchCase02 {

	public static void main(String[] args) {
		// 1: ������ȸ 2:��� 3:�Ա� :4�۱� �׿� : ��ȣ�� �߸� �Է��ϼ̽��ϴ�.
		
		int num;
		String message;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("��ȣ�� �Է��ϼ���."));

		switch (num) {
		case 1:
			message = "������ȸ";
			break;
		case 2:
			message = "���";
			break;
		case 3:
			message = "�Ա�";
			break;
		case 4:
			message = "�۱�";
			break;
		default:
			message = "��ȣ�� �߸� �Է��ϼ̽��ϴ�.";
			break;
		}//switch
			System.out.println(message)	;
	}//main

}//class
