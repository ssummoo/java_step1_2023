package chapter01;

public class LongVariable {

	public static void main(String[] args) {

		//int num1=12345678900; //32bit = 4byte
		long num2=12345678900L;
		long num3=1000; // long���� 64bit���� L�� ������ �������Ƿ� int�� �ν�(int����)
		
		int level; //�����ϰ� �ʱ�ȭ���� ���� ����(���� ������������) 
		level=10; //���ͳΰ�
		
		System.out.println(num2+num3); // ����� �ν� : long
		System.out.println(level);
	}

}
