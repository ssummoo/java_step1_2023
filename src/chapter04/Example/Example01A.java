package chapter04.Example;

public class Example01A {

	public static void main(String[] args) {
		// for���� �̿��Ͽ� ���� �迭�� ������ �ٴ����� ����� ���Ͻÿ�
		
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
			System.out.println((i + 1) + "��° ���� �� : " + sum);
			System.out.println((i + 1) + "��° ���� ��� : " + (Math.round(avg * 100) / 100.0));
			System.out.println();
		} // for
		System.out.println("��ü ���� �� : " + total);
		System.out.println("��ü ���� ��� : " + tavg);
	}// main

}//class
