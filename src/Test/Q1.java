package Test;

public class Q1 {

	public static void main(String[] args) {
		// 바이트 크기가 작은 자료형을 더 큰 자료형으로 대입하는 자동 형 변환의 코드 2가지 구현

		
		byte bNum = 100;
	    int iNum = bNum;
		 
		int aNum = 9999999;
		long lNum =aNum;
		
		char ch1 = '솔';
		String str1 = ch1 + "";
		
				 
		 System.out.println(iNum);
		 System.out.println(lNum);
		 System.out.println(str1);
		 
		 
	}

}
