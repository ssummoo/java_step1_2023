package Chapter06;

public class StdInfo {

	//�ʵ�(�������)
	public String studentName;
	public int grade;
	public int money;
	
	//free compile / default
	
	//������ Overloading
	public StdInfo(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	public void takeBus(Bus bus) {//�Ű������� ��ü�� ������ <Bus xx = new Bus();>
		bus.take(1000);
		this.money -=1000; // �л� ����
	}
		public void takeSubway(Subway subway) {
			subway.take(1500);
			this.money -=1500; // �л� ����
			
	}
		public void showInfo() {
			System.out.println(studentName+" ���� ���� �ܾ��� : "+money+" �� �Դϴ�.");
		}
		
}
