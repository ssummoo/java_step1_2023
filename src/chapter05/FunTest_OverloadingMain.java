package chapter05;

public class FunTest_OverloadingMain {

	public static void main(String[] args) {
		
		//Overloading -> Method ���� ���� ���°� �ٸ���� 
		//�ٸ� Ŭ������ Method�� �ҷ��ͼ� ���� ���·� ���
		FunTest_Overloading obj=new FunTest_Overloading();
		obj.getResult(20);
		obj.getResult('A');
		obj.getResult("�ζ�");
		obj.getResult(6 , "2023");
	}

}
