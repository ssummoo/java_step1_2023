package chapter05;

public class FunTest_OverloadingMain {

	public static void main(String[] args) {
		
		//Overloading -> Method 명이 같고 형태가 다른경우 
		//다른 클래스의 Method를 불러와서 여러 형태로 사용
		FunTest_Overloading obj=new FunTest_Overloading();
		obj.getResult(20);
		obj.getResult('A');
		obj.getResult("로또");
		obj.getResult(6 , "2023");
	}

}
