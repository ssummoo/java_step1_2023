package Chapter07.Encapsulation;

import javax.swing.JOptionPane;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		int side;
		int height;
		int Area;
		
		
		side=Integer.parseInt(JOptionPane.showInputDialog("길이를 입력하세요"));
		height=Integer.parseInt(JOptionPane.showInputDialog("높이를 입력하세요"));
		
		//객체생성
		Encapsulation obj1=new Encapsulation();
		//Encapsulation의 메소드를 사용하여 사각형의 넓이를 구하시오
		Area=obj1.Cal_Area(side, height);
		System.out.println("사각형의 넓이 : "+Area);
		String str="사각형의 넓이 : "+Area;
		JOptionPane.showMessageDialog(null, str);
	}

}
