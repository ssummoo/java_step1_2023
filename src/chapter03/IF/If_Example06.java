package chapter03.IF;

public class If_Example06 {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*6)+1;
		
		System.out.println(num);
		
		//1점 ~ 6점까지 받을 수 있음 각 점수당 분식 쏘기
		if(num==1) {
			System.out.println("1점 -> 순대");
		}
		else if(num==2) {
			System.out.println("2점 -> 떡볶이");
		}
		else if(num==3) {
			System.out.println("3점 -> 떡순");
		}
		else if(num==4) {
			System.out.println("4점 -> 떡튀");
		}
		else if(num==5) {
			System.out.println("5점 -> 떡순튀");
		}
		else {
			System.out.println("6점 -> 떡순튀+오뎅");
		}

	}

}
