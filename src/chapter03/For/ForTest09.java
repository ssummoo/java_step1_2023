	package chapter03.For;

import java.util.Scanner;

public class ForTest09 {

	public static void main(String[] args) {
		// 몇명의 성적을 입력을 것인지 정수로 인원수를 입력받고 총점과 평균을 구하시오(단, 평균은 실수로 출력할것)
		
		Scanner scan = new Scanner(System.in);
		
		int i, sum=0, cnt=0;
		double avg;
		int score; 
		
		System.out.print("몇명의 학생 점수를 입력받으시겠습니까 ? ");
		int stu=scan.nextInt();
		
		for(i=1; i<=stu; i++) {
		System.out.print(i+"번째 학생의 점수를 입력하세요");
			score=scan.nextInt();
			cnt++;
			sum+=score;
		}
			avg =sum/cnt;
			System.out.println("입력한 학생들의 총점 : "+sum);
			System.out.println("입력한 학생들의 평균 : "+avg);
			

	}

}
