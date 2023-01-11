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
			System.out.print("숫자를 입력하세요(1~50) : ");
			select=sc.nextInt();
			check=st.check(select);
			if(check.equals("SUCCESS"))
				break;
		}//while
		//do~while로 해보기**
	}//main

}
