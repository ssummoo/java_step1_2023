package Chapter06;

public class StudentInfo {

	//�ʵ�
	 int studentID;
	 private String studentName;
	 int grade;
	 String address;
	
	//������ ���� : free compile
	//Method 
	 public String getStudentName() {
		 return studentName;
		 }
	 public void setStudentName(String studentName) {
		 this.studentName=studentName;		 
	 }
	 //private �ڷḦ Method�� ���� class�� Main���� ���
}
