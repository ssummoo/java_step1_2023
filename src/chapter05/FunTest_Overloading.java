package chapter05;

public class FunTest_Overloading {
	
	//�ʵ�=�������
	
	//������(����Ʈ ����)
	
	//�������� ����
	//Overloading : �޼ҵ���� ���ϼ� �ְ� ����ؾ��ϴ� ���, �޼ҵ� �Ű������� ������ ������ �ٸ����Ͽ� ����
	
	public void getResult(int n) {
		System.out.println(n+"��(��) int�Դϴ�.");
		
	}
	public void getResult(String n) {
		System.out.println(n+"��(��) String�Դϴ�.");
		
	}
	public void getResult(char n) {
		System.out.println(n+"��(��) char�Դϴ�.");
		
	}
	public void getResult(int n, String str) {
		System.out.println(n+"��(��) Int�� String �Դϴ�.");
		
	}

}
