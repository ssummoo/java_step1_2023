package Test;

public class Q5 {
	public static void main(String[] args) {
		//'글'이라는 한글 문자의 유니코드 값을 찾아서 char형으로 선언한 변수에 저장한 뒤 그 변수를 출력
		
		char ch1 = '글';
		char ch2 = '\uae00';
		
		
		System.out.println(ch1);
		System.out.println(ch2);
	}
}
