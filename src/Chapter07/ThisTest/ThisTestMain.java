package Chapter07.ThisTest;

import javax.swing.JOptionPane;

public class ThisTestMain {

	public static void main(String[] args) {
		
		ThisTest R1=new ThisTest();
		
		R1.Move();
		R1.Move();
		System.out.println("======================");
		R1.RAge();
		System.out.println("======================");
		int R_speed=Integer.parseInt(JOptionPane.showInputDialog("�κ� �ӵ�"));
		int R_age=Integer.parseInt(JOptionPane.showInputDialog("�κ� ����"));
		String R_name=JOptionPane.showInputDialog("�κ� �̸�");
		String R_num=JOptionPane.showInputDialog("�κ� ��ȣ");
		
		ThisTest R2=new ThisTest(R_speed, R_age, R_name, R_num);
		int speed=R2.getSpeed();
		System.out.println("�ӵ� : "+speed);
		System.out.println("���� : "+R2.getAge());
		System.out.println("�̸� : "+R2.getRobotName());
		System.out.println("��ȣ : "+R2.getRobotNum());
		R2.Move();
		R2.RName();
		R2.RAge();
		R2.Stop();
	
	}

}
