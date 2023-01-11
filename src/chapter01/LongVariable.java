package chapter01;

public class LongVariable {

	public static void main(String[] args) {

		//int num1=12345678900; //32bit = 4byte
		long num2=12345678900L;
		long num3=1000; // long형의 64bit지만 L로 선언을 안했으므로 int로 인식(int범위)
		
		int level; //선언만하고 초기화되지 않은 상태(값을 지정하지않음) 
		level=10; //리터널값
		
		System.out.println(num2+num3); // 결과값 인식 : long
		System.out.println(level);
	}

}
