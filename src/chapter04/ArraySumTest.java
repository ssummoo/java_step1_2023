package chapter04;

public class ArraySumTest {

	public static void main(String[] args) {
		// 

		int score[]= {98,90,87};
		
		int sum=0;
		
		for(int i=0; i<score.length; i++) {
			System.out.println("score["+i+"]"+" : "+score[i]);
			sum+=score[i];
			
		}//for
		double avg =sum/(double)score.length;
		System.out.println("ÃÑÁ¡ : "+sum);
		//¹Ý¿Ã¸²
		System.out.println("Æò±Õ : "+Math.round(avg));
		
	}//main

}//class
