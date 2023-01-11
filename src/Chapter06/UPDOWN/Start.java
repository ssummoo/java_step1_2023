package Chapter06.UPDOWN;

import java.util.Random;

public class Start {

	private int random=new Random().nextInt(50)+1;
	private int count=0;
	private String result="FAIL";
	
	public String check(int mynumber) {
		count++;
		//random값보다 작으면 up/ 크면 down / 일치하면 -> result=>"SUCCESS"
		if(random>mynumber) {
			System.out.println("UP!!");
		}else if(random<mynumber) {			
			System.out.println("DOWN!!");
		}else {
			System.out.println(count+"회 만에 정답!!");
			result="SUCCESS";
	}
		return result;
}

	
}
