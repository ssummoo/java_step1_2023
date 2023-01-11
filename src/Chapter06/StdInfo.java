package Chapter06;

public class StdInfo {

	//필드(멤버변수)
	public String studentName;
	public int grade;
	public int money;
	
	//free compile / default
	
	//생성자 Overloading
	public StdInfo(String studentName, int money) {
		this.studentName=studentName;
		this.money=money;
	}
	public void takeBus(Bus bus) {//매개변수로 객체를 가져옴 <Bus xx = new Bus();>
		bus.take(1000);
		this.money -=1000; // 학생 지출
	}
		public void takeSubway(Subway subway) {
			subway.take(1500);
			this.money -=1500; // 학생 지출
			
	}
		public void showInfo() {
			System.out.println(studentName+" 님의 남은 잔액은 : "+money+" 원 입니다.");
		}
		
}
