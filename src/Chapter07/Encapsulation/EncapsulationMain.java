package Chapter07.Encapsulation;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		int side;
		int height;
		int Area;
		
		
		side=Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���"));
		height=Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���"));
		
		//��ü����
		Encapsulation obj1=new Encapsulation();
		//Encapsulation�� �޼ҵ带 ����Ͽ� �簢���� ���̸� ���Ͻÿ�
		Area=obj1.Cal_Area(side, height);
		System.out.println("�簢���� ���� : "+Area);
		String str="�簢���� ���� : "+Area;
		JOptionPane.showMessageDialog(null, str);
	}

}
