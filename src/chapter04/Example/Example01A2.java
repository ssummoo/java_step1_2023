package chapter04.Example;

public class Example01A2 {

	public static void main(String[] args) {
		// for���� �̿��Ͽ� ���� �迭�� ������ �ٴ����� ����� ���Ͻÿ�
		
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
			System.out.println("�� ���� �� : " + total);
			avg=total/(double)array[i].length;
			System.out.println("�� ���� ��� : " + Math.round(avg));
			System.out.println("------------------------------");
			alltotal+=total;
			//�����Ⱚ�ʱ�ȭ
			total=0;
			avg=0;
		} // for
		double allavg=alltotal/(double)count;
		System.out.println("��ü ���� : "+alltotal);
		System.out.println(String.format("��ü ��� : %.2f",allavg));
		 */
		//���3
		for(int[]num :array) {
			for(int score:num) {
				total+=score;
				
			}//inner for
			count++;
			System.out.println(count + "��°�� �л��� �հ� : "+total);
			total=0;//�����Ⱚ�ʱ�ȭ
		}//outer for
		
	}// main

}//class

