package Chapter07;

class Person2 {

	// �������
	String name;
	int age;

	public Person2() {
		this("�̸�����", 0);   //Person2(String str, int a)�� �ʿ�
	}
	
	public Person2(String name, int age) {
		this.name=name;
		this.age=age;
		
	}
	
	//�ڱ��ڽ��� �ּ�
	Person2 returnSElf() {
		return this;
	}

}

public class CallAnotherConst {

	public static void main(String[] args) {
		Person2 noName=new Person2();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println("noName�� �ּ� : "+noName);
		System.out.println("noName�� �ּ� : "+noName.returnSElf());
		//noName�� p�� ��ü�� ���� �ٸ������� �Ҵ�
		System.out.println("============================");
		Person2 p=new Person2();
		System.out.println("p�� �ּ� : "+p);
		//�ּҺ���
		Person2 person=noName.returnSElf();
		System.out.println("person�� �ּ� : "+person);
		System.out.println("noName�� �ּ� : "+noName);
		
		
		
	}

}
