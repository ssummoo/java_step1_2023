package Chapter06.Can;

import java.util.Scanner;

public class CanMain {

	public static void main(String[] args) {
		
		String select="";
		int money=0;
		
		Vending ven=new Vending();
		ven.init();// �����غ�
		
		System.out.print("���� �����ϼ��� : ");
		Scanner scan=new Scanner(System.in);
		money=scan.nextInt();
		ven.showCans(money);
		
		System.out.print("���Ḧ �����ϼ��� ");
		
		select=scan.next();
		ven.outcan(select);
	}

}
