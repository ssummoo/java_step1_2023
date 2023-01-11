package Test;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		int num, stu=0, sum = 0, max = 0;
		int score[] = null;
		double avg = 0;

		while (run) {
			System.out.println("==============================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4. 분석 | 5.종료 ");
			System.out.println("----------------------------------------------");
			System.out.print("번호를 입력하세요 >> ");
			num = sc.nextInt();
			if (num <= 0 || num > 5) {
				System.out.println("잘못 입력하셨습니다.");
			} else if (num == 1) {
				System.out.print("학생수 : ");
				stu = sc.nextInt();
				score=new int[stu];
				
			} else if (num == 2) {
				for (int i = 0; i < score.length; i++) {
					System.out.print((i+1)+"번 학생의 점수 :");
					score[i] = sc.nextInt();
				} // f
			} else if (num == 3) {
				for (int i = 0; i < score.length; i++) {
					System.out.println((i+1) + "번 학생의 점수 : " + score[i]);
				} // f
			} else if (num == 4) {
				for (int i = 0; i < score.length; i++) {
					sum += score[i];
					if (max <= score[i]) {
						max = score[i];
					}
				} // f
				avg = sum / (double)stu;
				System.out.println("최고점수 : " + max);
				System.out.println("총점 : " + sum);
				System.out.println(String.format("평균 : %.2f",avg));
			} else if (num == 5) {
				run = false;
			}

		} // w
		System.out.println("이용해주셔서 감사합니다.");

	}// m

}
