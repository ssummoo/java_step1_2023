package Chapter06;

import java.util.Scanner;

public class GuguDanMain {

	public static void main(String[] args) {
		
	 GuguDan gd=new GuguDan();
	 int num;
	 
	 System.out.print("����� ���� �Է��ϼ��� : ");
	 Scanner s=new Scanner(System.in);
	 
	 num=s.nextInt();
	 
	 gd.showTalbe(num);
			 

}
}
