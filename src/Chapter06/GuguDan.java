package Chapter06;



public class GuguDan {

	//멤버변수
	//생성자 생략
	//Method
	public void showTalbe(int num) {
		System.out.println(num+"단");
		for(int i=1; i<=9; i++){
			System.out.println(num+" X "+i+" = "+num*i);
		}
	}
	
}
