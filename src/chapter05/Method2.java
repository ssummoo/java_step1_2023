package chapter05;

import java.util.Scanner;

public class Method2 {
	
	int cnt, num;
	boolean run = true;
	String str="";
	Method br=new Method();
	
	Scanner scan = new Scanner(System.in);
	
	public Method2() {
		
	}

	void order2() {
		while (run) {
			System.out.println("==============================");
			System.out.println("1. �� ���� ����\t2. ���� ������ ����\t3. ����");
			System.out.print("���� >>>");
			num = scan.nextInt();
			
			switch (num) {
			case 1:
				br.makeBread(cnt);
				break;
			case 2 : 
				br.makeBread(cnt, str);
				break;
			default :
				System.out.println("�߸��� ��ȣ �Դϴ�.");
				
			}
		}
	}
	
}