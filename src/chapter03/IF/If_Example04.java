package chapter03.IF;

import javax.swing.JOptionPane;

public class If_Example04 {

	public static void main(String[] args) {
		// ���ð��� ������ ������ �Ƶ��� 1000��
		// ���ð��� ������ �ʵ��л��� 2000��
		// ���ð��� ������ ��.����л��� 3500��
		// ���ð��� ������ ������ 5000��

		int age;
		int charge;
		String index;
		
		// swing(���̸� �Է��ϼ���) ����Ͽ� �Է� �ޱ�

		age = Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���."));

		// if
		if (age <= 7) {
			charge = 1000;
			index = "������ �Ƶ�";
			
		} else if (age <= 13) {
			charge = 2000;
			index = "�ʵ��л�";
			
		} else if (age <= 19) {
			charge = 3500;
			index ="�߰���л�";
			
		} else {
			charge = 5000;
			index = "����";
		}
		System.out.println(index+"�Դϴ�.");
		System.out.println("������ " + charge + "�� �Դϴ�.");

	}

}
