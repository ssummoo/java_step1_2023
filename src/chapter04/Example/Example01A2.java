package chapter04.Example;

public class Example01A2 {

	public static void main(String[] args) {
		// for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
		
		int[][] array = { {95,86}, {83,92,96}, {78,83,93,87,88} };
		
		double avg = 0;
		int total = 0;
		int count = 0;
		int alltotal=0;
		/*		  	
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				count++;			
				total+= array[i][j];
			}		
			System.out.println("각 행의 합 : " + total);
			avg=total/(double)array[i].length;
			System.out.println("각 행의 평균 : " + Math.round(avg));
			System.out.println("------------------------------");
			alltotal+=total;
			//쓰레기값초기화
			total=0;
			avg=0;
		} // for
		double allavg=alltotal/(double)count;
		System.out.println("전체 총합 : "+alltotal);
		System.out.println(String.format("전체 평균 : %.2f",allavg));
		 */
		//방법3
		for(int[]num :array) {
			for(int score:num) {
				total+=score;
				
			}//inner for
			count++;
			System.out.println(count + "번째줄 학생의 합계 : "+total);
			total=0;//쓰레기값초기화
		}//outer for
		
	}// main

}//class

