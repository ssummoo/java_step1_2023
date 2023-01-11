package Chapter06;

import java.util.Scanner;

public class StudentInfoMain {

	public static void main(String[] args) {

		StudentInfo studentKim=new StudentInfo();
		Scanner sc=new Scanner(System.in);
		
		studentKim.studentID=1004;
		studentKim.grade=3;
		studentKim.address="서울시 종로구";
		
		studentKim.setStudentName("홍길동"); //set으로 보내고
		String name=studentKim.getStudentName(); //get으로 받기
				
		System.out.println(name);
				
	
	}

}
