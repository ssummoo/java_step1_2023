package chapter05;

public class Funtest03 {
	
	public static void swap(int x, int y) {
		//��ü�˰���
		int temp=x;
		x=y;
		y=temp;
		System.out.println("swap() ��� �� : x="+x+", y"+y);
	}

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		System.out.println("swap() ȣ�� �� : a="+a+", b"+b);
		System.out.println("=================================");
		swap(a,b);
		System.out.println("=================================");
		System.out.println("swap() ȣ�� �� : a="+a+", b"+b);
		
	}

}
