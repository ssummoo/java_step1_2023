package Chapter06.UPDOWN;

import java.util.Scanner;

public class StartMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Start st=new Start();
		
		int select;
		String check;
		
		while(true){
			System.out.print("���ڸ� �Է��ϼ���(1~50) : ");
			select=sc.nextInt();
			check=st.check(select);
			if(check.equals("SUCCESS"))
				break;
		}//while
		//do~while�� �غ���**
	}//main

}
