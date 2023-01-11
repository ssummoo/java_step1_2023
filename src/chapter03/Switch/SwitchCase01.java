package chapter03.Switch;

public class SwitchCase01 {

	public static void main(String[] args) {
		
		int ranking=3;
		char medalColor;
		
		switch (ranking) {
		case 1: 
			medalColor='G';
			break;
		case 2: 
			medalColor='S';
			break;
		case 3:
			medalColor='B';
			break;
			
		default: // 나머지 value , if 함수의 else 기능
			medalColor='A';
			break; // default뒤에 break는 생략가능
			
		}
		
		System.out.println(ranking+"등 메달은 "+medalColor+"입니다.");
		
	}//main
	
}//class
