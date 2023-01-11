package Chapter06.Baseball;

import java.util.Random;
import java.util.Scanner;

public class Ball {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		
		//컴퓨터가 발생한 난수 1개
		int com1=0;
		int com2=0;
		int com3=0;
		
		do {
			//1에서 9사이의 난수 발생
			com1=new Random().nextInt(9)+1;
			com2=new Random().nextInt(9)+1;
			com3=new Random().nextInt(9)+1;
		} while (com1==com2 || com2==com3 || com1==com3);
		
		//컴퓨터 준비 완료 
		//사용자가 입력할 수 
		int user1=0;
		int user2=0;
		int user3=0;
		
		while (true) {
			System.out.println("==1~9 사이의 수를 입력하세요==");
			System.out.print("첫번째 수를 입력하세요 : ");
			user1=scan.nextInt(); //사용자가 준비한 수 
			System.out.print("두번째 수를 입력하세요 : ");
			user2=scan.nextInt();
			System.out.print("세번째 수를 입력하세요 : ");
			user3=scan.nextInt();
			
			int strike=0;
			int ball=0;
			
			//com1과 user1 같으면 S / com2 com3과 user1이 같으면 B
			if(user1==com1) {
				strike++;
			}else if(user1==com2 || user1==com3) {
				ball++;
			}
			if(user2==com2) {
				strike++;
			}else if(user2==com1 || user2==com3) {
				ball++;
			}
			if(user3==com3) {
				strike++;
			}else if(user3==com2 || user3==com1) {
				ball++;
			}
			if(strike==3) {
				System.out.println("정답 !\t"+com1+com2+com3);
				break;
			}else {
				if(strike > 0 || ball > 0) {
					System.out.println(strike+"S "+ball+"B");					
				}else {
					System.out.println("OUT");
					System.out.println("===============");
				}
			}
		}//while
	}

}
