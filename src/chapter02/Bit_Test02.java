package chapter02;

public class Bit_Test02 {

	public static void main(String[] args) {

		int num=0B00000101; // 5
		System.out.println(num);
		
		System.out.println(num << 2); //���� 0B00010100
		System.out.println(num >> 2); //���� 0B00000001
		
		int a, b, c;
		a=5;
		b=2;
		c=a>>b; // ����
		System.out.println(c);
		
		c=a<<b; // ����
		System.out.println(c);

	}

}
