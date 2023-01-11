package Chapter07.Car;

public class CarMain {

	public static void main(String[] args) {
		//객체를 생성하면서 초기화
		Car obj1=new Car("검정",3000);
		//멤버 변수 이용하여 하나씩 초기화
		//obj1.color="화이트";
		
		
		
		//멤버변수에 직접 접근해서 출력
		System.out.println(obj1.color+"\t"+obj1.cc);
		System.out.println("========================");
		
		//메소드를 이용한 출력
		System.out.println(obj1.getColor()+"\t"+obj1.getCc());

	}

}
