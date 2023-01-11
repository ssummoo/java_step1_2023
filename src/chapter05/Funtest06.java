package chapter05;

public class Funtest06 {

	public String channel;
	public int channelInt;
	public int volume;
	
	//생성자 생략
	
	//Void외에 모든 타입의 메소드 반드시 꼭 return값을 갖는다
	public int channelUp(int volume) {
		this.volume=volume;
		System.out.println("소리를 높이겠습니다.");		
		return volume+2;		
	}
	
	public void channelDown(int volume) {
		this.volume=volume;
		System.out.println("소리를 "+volume+"만큼 올립니다.");
		//return volume+2; void는 return값이 존재할 수 없다.
	}
	
	public static void main(String[] args) {
		Funtest06 tv=new Funtest06();
		//방법1
		//tv.channelUp(9);
		//System.out.println("소리를 "+tv.channelUp(9)+"만큼 올립니다.");
		//방법2
		int volume=tv.channelUp(9);//11
		System.out.println("소리를 "+volume+"만큼 올립니다.");
		tv.channelDown(5);
	}//m

}
