package chapter05;

public class FunTest_Overloading {
	
	//필드=멤버변수
	
	//생성자(디폴트 생략)
	
	//다형성을 만족
	//Overloading : 메소드명을 통일성 있게 사용해야하는 경우, 메소드 매개변수의 종류와 갯수를 다르게하여 구현
	
	public void getResult(int n) {
		System.out.println(n+"은(는) int입니다.");
		
	}
	public void getResult(String n) {
		System.out.println(n+"은(는) String입니다.");
		
	}
	public void getResult(char n) {
		System.out.println(n+"은(는) char입니다.");
		
	}
	public void getResult(int n, String str) {
		System.out.println(n+"은(는) Int와 String 입니다.");
		
	}

}
