package Chapter06.Computer;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer myCom=new Computer();
		
		//规过1
		int values1[]= {1,2,3,};
		int result=myCom.sum1(values1);
		System.out.println("result : "+result);
		
		//规过2
		int result2=myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2 : "+result2);
		
		//规过3
		int result3=myCom.sum2(1,2,3);
		System.out.println("resul3 : "+result3);
		
		//规过4
		int result4=myCom.sum2(1,2,3,4,5,6,7,8,9,10);
		System.out.println("resul4 : "+result4);
		
		
	
	}
}
