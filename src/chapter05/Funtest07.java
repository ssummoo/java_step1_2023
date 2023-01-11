package chapter05;

import java.util.Scanner;

public class Funtest07 {

	
	public static void Edustep(int edu) {
		
		
		
		if(edu==1) {
			System.out.println("현재 스터디 단계는 step1 입니다.");
		}else if(edu==2) {
			System.out.println("현재 스터디 단계는 step2 입니다.");			
		}else if(edu==3) {
			System.out.println("현재 스터디 단계는 step3 입니다.");
			
		}else {
						
		}

	
	}

/*
 * 	
	public static String Edustep(int edu) {
		
		String step;
		
		if(edu==1) {
			step="1단계";
		}else if(edu==2) {
			step="2단계";
		}else if(edu==3) {
			step="3단계";
		}else {
			step="Error";			
		}
		return step;
	}
 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("스터디 단계를 입력하세요 : ");
		int number=scan.nextInt();
		
		//return값이 있는경우
		//String step=Edustep(number);
		//System.out.println("현재 수업 단계는 : " +step+"입니다.");
		
		//return값이 없는 경우
		Edustep(number);

	}

}
