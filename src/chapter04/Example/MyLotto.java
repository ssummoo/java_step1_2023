package chapter04.Example;

import javax.swing.JOptionPane;

public class MyLotto {

	public static void main(String[] args) {
		// �ζ� ��ȣ 6���� ���� �迭

		int number;
		int cnt = 0;
		int[] lotto = new int[6];

		System.out.println("\tL\tO\tT\tT\tO");
		//number=Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ����Ƚ���� �Է��ϼ���"));
		System.out.print("[ "+(cnt+1)+" ] : ");
		
		for(int i=0; i<lotto.length; i++) {
			number = (int)(Math.random()*30)+1;
			lotto[i]=number;
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}//for
		
	
		//while(number > cnt) {
			
			System.out.print(lotto[i]+"\t");

		}//f
		cnt++;

	}//m
}// c
