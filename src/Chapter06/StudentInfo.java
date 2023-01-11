package Chapter06;

public class StudentInfo {

	//필드
	 int studentID;
	 private String studentName;
	 int grade;
	 String address;
	
	//생성자 생략 : free compile
	//Method 
	 public String getStudentName() {
		 return studentName;
		 }
	 public void setStudentName(String studentName) {
		 this.studentName=studentName;		 
	 }
	 //private 자료를 Method를 통해 class밖 Main에서 사용
}
