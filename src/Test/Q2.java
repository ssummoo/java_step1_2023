package Test;

public class Q2 {

	public static void main(String[] args) {
		// 실수를 정수형 변수에 대입하는 경우에 형변환이 자동으로 이루어지고 소수점 이하 부분이 없어지는 형변환 코드 2가지 구현

		double dNum = 3.14;
		float fNum = 1.414f;
		
		int iNum1 = (int)dNum;
		int iNum2 = (int)fNum;
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		
	}

}
