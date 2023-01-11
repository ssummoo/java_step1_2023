package Chapter07.Overload;

public class OverloadMain {

	public static void main(String[] args) {
		
		Overload obj1=new Overload();
		obj1.Disp();
		System.out.println("=========================");
		
		Overload obj2=new Overload(22, 172.3f);
		obj2.Disp();
		System.out.println("=========================");
		
		Overload obj3=new Overload(25, 164.3f, "ÄáÁã");
		obj3.Disp();
		System.out.println("=========================");
		
	}
}
