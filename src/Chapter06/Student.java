package Chapter06;

public class Student {

	//필드(멤버변수)
	 int studentID;
	 public String studentName;
	 int grade;
	 String address;
	
	 //default 생성자 (free compile)
	 public Student() {  //오버로딩된 생성사자 있을시 디폴트를 사용하기 위해서는 반드시 명시(생략이 불가능)
		// TODO Auto-generated constructor stub
	}
	 
	 //생성자 Overloading
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
