package chapter05;

public class Funtest05 {

	public String channel; //�������
	public int channelInt; //�������
	public int volume; //�������
	
	public void channelUp(int volume) {
		System.out.println("�Ҹ��� "+volume+"��ŭ �ø��ϴ�.");
	}
	
	public void channelDown(int volume) {
		System.out.println("�Ҹ��� "+volume+"��ŭ �����ϴ�.");
		
	}
	//�����ε� -> �޼ҵ� �̸��� ������ Ÿ���� �ٸ��� 
	//����������
	public void channelChange(String channel) {
		System.out.println("TV ä���� "+channel+"�� �ٲߴϴ�.");
		
	}
	public void channelChange(int channelInt) {
		System.out.println("ä���� "+channelInt+"�� �ٲߴϴ�.");
		
	}
	
//======================================================	
	public static void main(String[] args) {
		Funtest05 tv=new Funtest05(); //static�ȳ־ ���ο� �޸� �Ҵ�??
		
		tv.channelUp(3);
		tv.channelDown(5);
		
		tv.channelChange("TvN");
		tv.channelChange(5);
		
	}//m

}
