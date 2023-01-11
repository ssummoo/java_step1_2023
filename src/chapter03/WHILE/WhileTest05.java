package chapter03.WHILE;

import java.util.Scanner;

public class WhileTest05 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		int num, cnt=0, sum=0;
		double avg=0;
		
		while(true) {
		//0을 입력하면 종료
			System.out.print("숫자를 입력하세요 : ");
			num = scan.nextInt();
			
			if(num==0) {
				break;
			}
			sum+=num;
			cnt++;
			avg=sum/(double)cnt;
			
		}//while
			System.out.println("입력된 숫자의 갯수 : "+cnt);
			System.out.println("입력된 숫자의 총합 : "+sum);
			System.out.println("입력된 숫자의 평균 : "+avg);	
			System.err.println("프로그램 종료 ");
	}// main

}//class
