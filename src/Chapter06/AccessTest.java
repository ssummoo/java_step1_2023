package Chapter06;

public class AccessTest {

	//�ʵ�
	private int aa;
	public int bb;
	int cc; // ������ public
	
	//����Ʈ ������
	
	//method
	/*
	 */
	public void setAa(int aa) {
		this.aa = aa;
	}
	
	public void setBb(int bb) {
		this.bb = bb;
	}
	
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public void Disp() {
		System.out.println("aa�� : " + aa+ "\nbb�� : "+bb+"\ncc�� : "+cc);
		
	}
	
	
	public static void main(String[] args) {
		// ��ü(obj)
		AccessTest obj= new AccessTest();
		obj.setAa(10);  //=obj.aa=10;
		obj.setBb(20);  //=obj.bb=20;
		obj.setCc(30);  //=obj.cc=30;
	    //set~ ������ aa, bb, cc, �����ؾߵ�
		obj.Disp();
		

	}
}
