package Chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		//�л� 2�� ����
		StdInfo studentJames=new StdInfo("James",12000);
		StdInfo studentTom=new StdInfo("Tom",10000);
		
		
		
		//����Ÿ��
		Bus bus100=new Bus(100);
		studentJames.takeBus(bus100);
		//����Ȯ��
		studentJames.showInfo();//����
		bus100.showInfo();// �������� �ο��� ����
		System.out.println("==========================");
		Bus bus987=new Bus(987);
		studentTom.takeBus(bus987);
		studentTom.showInfo();
		bus987.showInfo();
		System.out.println("==========================");
		
		//����ö
		Subway sub2=new Subway("2ȣ��");
		studentJames.takeSubway(sub2);
		studentJames.showInfo();
		sub2.showInfo();
		System.out.println("==========================");
		studentTom.takeSubway(sub2);
		studentTom.showInfo();
		sub2.showInfo();
		System.out.println("==========================");
		
	}

}
