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
			System.out.println("1.예금 | \t2.출금 | \t3.잔고 | \t4.종료");
			System.out.println("===============================");
			System.out.print("선택 >> ");
			num=scan.nextInt();
			
			switch (num) {
			case 1: //0이하의 금액이 입력되었을때 예외 처리
				System.out.print("예금액 >> ");
				sv=scan.nextInt();
				if(sv<=0) {
					System.out.println("잘못된 금액입니다.");
				}
				balance+=sv;
				System.out.println();
				break;
			case 2: //잔액이 부족합니다 예외처리
				System.out.print("출금액 >> ");
				wd=scan.nextInt();
				if(wd>balance) {
					System.out.println("잔액이 부족합니다.");
				}
				balance-=wd;
				System.out.println();
				break;
			case 3:
				System.out.print("잔고 >> "+balance);
				System.out.println();
				break;
			case 4:
				System.out.print("이용해주셔서 감사합니다.");
				run=false;
				break;
			default:
				System.out.println("잘못된 번호입니다.");
			}

			}
		}
	}

