package chapter05;

public class Funtest05 {

	public String channel; //멤버변수
	public int channelInt; //멤버변수
	public int volume; //멤버변수
	
	public void channelUp(int volume) {
		System.out.println("소리를 "+volume+"만큼 올립니다.");
	}
	
	public void channelDown(int volume) {
		System.out.println("소리를 "+volume+"만큼 내립니다.");
		
	}
	//오버로딩 -> 메소드 이름은 같은데 타입을 다르게 
	//다형성만족
	public void channelChange(String channel) {
		System.out.println("TV 채널을 "+channel+"로 바꿉니다.");
		
	}
	public void channelChange(int channelInt) {
		System.out.println("채널을 "+channelInt+"로 바꿉니다.");
		
	}
	
//======================================================	
	public static void main(String[] args) {
		Funtest05 tv=new Funtest05(); //static안넣어서 새로운 메모리 할당??
		
		tv.channelUp(3);
		tv.channelDown(5);
		
		tv.channelChange("TvN");
		tv.channelChange(5);
		
	}//m

}
