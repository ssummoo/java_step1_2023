package Chapter06;

public class Student {

	//�ʵ�(�������)
	 int studentID;
	 public String studentName;
	 int grade;
	 String address;
	
	 //default ������ (free compile)
	 public Student() {  //�����ε��� �������� ������ ����Ʈ�� ����ϱ� ���ؼ��� �ݵ�� ���(������ �Ұ���)
		// TODO Auto-generated constructor stub
	}
	 
	 //������ Overloading
	 public Student(String studentName, String address) {
		this.studentName=studentName;
		this.address=address;
	}

	 public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
	public void showStudentInfo() {
		System.out.println(studentName+", "+address);
		
	}
	 
	 
}
