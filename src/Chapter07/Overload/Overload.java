package Chapter07.Overload;

public class Overload {

	private String name;
	private int age;
	private float h;

	public Overload() {
		age=0;
		h=0;
		name="�͸�";
	}
	public Overload(int a, float ki) {
		age=a;
		h=ki;
		name="�͸�";
	}
	public Overload(int a, float ki, String n) {
		age=a;
		h=ki;
		name=n;
	}
	
	public void Disp() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("Ű : "+h);
		
	}
}
