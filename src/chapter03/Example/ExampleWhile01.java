package chapter03.Example;

import java.util.Scanner;

public class ExampleWhile01 {

	public static void main(String[] args) {
		
		boolean run=true;
		
		int balance=0;
		int sv, wd;
		int num;
		Scanner scan=new Scanner(System.in);
		
		while(run){
			System.out.println("===============================");
			System.out.println("1.���� | \t2.��� | \t3.�ܰ� | \t4.����");
			System.out.println("===============================");
			System.out.print("���� >> ");
			num=scan.nextInt();
			
			switch (num) {
			case 1: //0������ �ݾ��� �ԷµǾ����� ���� ó��
				System.out.print("���ݾ� >> ");
				sv=scan.nextInt();
				if(sv<=0) {
					System.out.println("�߸��� �ݾ��Դϴ�.");
				}
				balance+=sv;
				System.out.println();
				break;
			case 2: //�ܾ��� �����մϴ� ����ó��
				System.out.print("��ݾ� >> ");
				wd=scan.nextInt();
				if(wd>balance) {
					System.out.println("�ܾ��� �����մϴ�.");
				}
				balance-=wd;
				System.out.println();
				break;
			case 3:
				System.out.print("�ܰ� >> "+balance);
				System.out.println();
				break;
			case 4:
				System.out.print("�̿����ּż� �����մϴ�.");
				run=false;
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�.");
			}

			}
		}
	}

