package chapter04.Example;

public class Example01A {

	public static void main(String[] args) {
		// for문을 이용하여 다음 배열의 점수를 줄단위로 평균을 구하시오
		
		int[][] array = { {95,86}, {83,92,96}, {78,83,93,87,88} };
		
		int sum = 0, total = 0;
		double avg = 0, tavg = 0;
		int count = 0 , tcount = 0;
		for (int i = 0; i < array.length; i++) {
			sum = 0;
			count = 0;
			for (int j = 0; j < array[i].length; j++) {
				count++;
				tcount++;
				sum += array[i][j];
				avg = sum / (double) count;
				total += array[i][j];
				tavg = total / (double) tcount;
			} // for
			System.out.println((i + 1) + "번째 줄의 합 : " + sum);
			System.out.println((i + 1) + "번째 줄의 평균 : " + (Math.round(avg * 100) / 100.0));
			System.out.println();
		} // for
		System.out.println("전체 수의 합 : " + total);
		System.out.println("전체 수의 평균 : " + tavg);
	}// main

}//class
