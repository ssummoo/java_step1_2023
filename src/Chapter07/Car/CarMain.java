package Chapter07.Car;

public class CarMain {

	public static void main(String[] args) {
		//��ü�� �����ϸ鼭 �ʱ�ȭ
		Car obj1=new Car("����",3000);
		//��� ���� �̿��Ͽ� �ϳ��� �ʱ�ȭ
		//obj1.color="ȭ��Ʈ";
		
		
		
		//��������� ���� �����ؼ� ���
		System.out.println(obj1.color+"\t"+obj1.cc);
		System.out.println("========================");
		
		//�޼ҵ带 �̿��� ���
		System.out.println(obj1.getColor()+"\t"+obj1.getCc());

	}

}
