package Chapter06;

import java.util.Scanner;

public class StudentInfoMain {

	public static void main(String[] args) {

		StudentInfo studentKim=new StudentInfo();
		Scanner sc=new Scanner(System.in);
		
		studentKim.studentID=1004;
		studentKim.grade=3;
		studentKim.address="����� ���α�";
		
		studentKim.setStudentName("ȫ�浿"); //set���� ������
		String name=studentKim.getStudentName(); //get���� �ޱ�
				
		System.out.println(name);
				
	
	}

}
