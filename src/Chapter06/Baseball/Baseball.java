package Chapter06.Baseball;

import java.util.Random;

public class Baseball {

	private int com1;
	private int com2;
	private int com3;
	public Baseball() {
	
	
	do {
		//1에서 9사이의 난수 발생
		com1=new Random().nextInt(9)+1;
		com2=new Random().nextInt(9)+1;
		com3=new Random().nextInt(9)+1;
	} while (com1==com2 || com2==com3 || com1==com3);
	}

	public int getCom1() {
		return com1;
	}

	public int getCom2() {
		return com2;
	}

	public int getCom3() {
		return com3;
	}

	
}