package Test;

import javax.swing.JOptionPane;

public class Lottoooo {

	public static void main(String[] args) {

		int number;
		int[] lotto = new int[6];

		System.out.println("\tL\tO\tT\tT\tO");
		number = Integer.parseInt(JOptionPane.showInputDialog("���ϴ� �ζ� ����Ƚ���� �Է��ϼ���"));

		for (int n = 0; n < number; n++) {
			System.out.print(n + 1 + "ȸ�� ");
			for (int i = 0; i < 6; i++) {
				lotto[i] = (int) (Math.random() * 45) + 1;
				for (int j = 0; j < i; j++) {
					if (lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < 6; i++) {
				System.out.print("[" + i + "]" + lotto[i] + "\t");
			}
			System.out.println();
		}

	}
}