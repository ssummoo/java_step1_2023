package chapter02;

public class Example03 {
	
	public static void main(String[] args) {

		//���׿����ڸ� �̿��Ͽ� score1�� 60�� ���� ũ�ų� ������ �հ� �׷��� ������ ���հ����� ��ȯ �Ͻÿ�
		
		
		int score1 = 60;
		String result;
		result = (score1 >= 60) ? "�հ�" : "���հ�";
		// String result=(score1 >= 60) ? "�հ�" : "������" ;
		System.out.println(result);
		
		//���׿����ڸ� �̿��Ͽ� score2�� 90���� ũ�� 'A'�̰� score�� 80���� ũ�� 'B' �� ���ϴ� ��� 'C'�� �����Ѵ�
		
		int score2 = 80;
		char ��� ;
		��� = (score2 > 90) ?  'A' : ((score2 > 80) ? 'B' : 'C') ;	
		
		System.out.println(���);
		
	}
}
