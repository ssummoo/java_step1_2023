package chapter03.For;

public class ForTest03 {

	public static void main(String[] args) {
		// 1���� 100������ ���� ���ϵ� ���� 100���Ͽ��� ��
		/*
		//���1
		System.out.println("1���� 100������ ���� ���ϵ� ���� 100�̸�");

		int i;
		int sum = 0;
		for (i = 1; i <= 100; i++) {
			sum += i;
			if (sum < 100) {
				System.out.println("���� " + i + "������ �� : " + sum + "�Դϴ�.");
			}//if
		}//for
		*/
		//���2
		System.out.println("1���� 100������ ���� ���ϵ� ���� 100�̸��� ���� ���� ū ��");
		
		int j;
		int sum1=0;
		for(j=1; j<=100; j++) {
			sum1+=j;
			if(sum1>=100)
				break;
		}
			System.out.println("�ش� ���� : "+(j-1)+"�Դϴ�.");
			System.out.println("���� "+(j-1)+"������ �� : "+(sum1-j)	);
		
		//���3
			System.out.println("1���� n������ ���� ���ϵ� ���� 100�� �ʰ��ϴ� ù��° ������");
			int k;
			int sum2=0;
			
			for(k=1; sum2<=100; k++) {
				sum2+=k;
			}
			System.out.println("�ش� ���� : "+(k-1)+"�Դϴ�.");
			System.out.println("���� "+(k-1)+"������ �� : "+(sum2)+"�Դϴ�");
			
		
	}

}
