package chapter05;

public class Funtest06 {

	public String channel;
	public int channelInt;
	public int volume;
	
	//������ ����
	
	//Void�ܿ� ��� Ÿ���� �޼ҵ� �ݵ�� �� return���� ���´�
	public int channelUp(int volume) {
		this.volume=volume;
		System.out.println("�Ҹ��� ���̰ڽ��ϴ�.");		
		return volume+2;		
	}
	
	public void channelDown(int volume) {
		this.volume=volume;
		System.out.println("�Ҹ��� "+volume+"��ŭ �ø��ϴ�.");
		//return volume+2; void�� return���� ������ �� ����.
	}
	
	public static void main(String[] args) {
		Funtest06 tv=new Funtest06();
		//���1
		//tv.channelUp(9);
		//System.out.println("�Ҹ��� "+tv.channelUp(9)+"��ŭ �ø��ϴ�.");
		//���2
		int volume=tv.channelUp(9);//11
		System.out.println("�Ҹ��� "+volume+"��ŭ �ø��ϴ�.");
		tv.channelDown(5);
	}//m

}
