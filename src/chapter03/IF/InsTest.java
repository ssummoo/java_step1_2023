package chapter03.IF;


class clsA{
	
	void fun() {
		System.out.println("2023�� 1�� ù�� ������ �Դϴ�.");
	}//fun
}//clsA

class clsB extends clsA{
}//clsB

public class InsTest {

	public static void main(String[] args) {
		// clsB�� �ν��Ͻ� ����
		clsB objB=new clsB();
		
		if(objB instanceof clsA) {
			System.out.println("Yes");
			objB.fun();
		}//if
		
		if(objB instanceof clsB) {
			System.out.println("Yes");
		}//if
	
	}//main

}//InsTest class
