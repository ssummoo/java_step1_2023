package chapter03.IF;

public class If_Example06 {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*6)+1;
		
		System.out.println(num);
		
		//1�� ~ 6������ ���� �� ���� �� ������ �н� ���
		if(num==1) {
			System.out.println("1�� -> ����");
		}
		else if(num==2) {
			System.out.println("2�� -> ������");
		}
		else if(num==3) {
			System.out.println("3�� -> ����");
		}
		else if(num==4) {
			System.out.println("4�� -> ��Ƣ");
		}
		else if(num==5) {
			System.out.println("5�� -> ����Ƣ");
		}
		else {
			System.out.println("6�� -> ����Ƣ+����");
		}

	}

}
