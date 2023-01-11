package chapter03.For;

public class ForTest16 {

	public static void main(String[] args) {

		for(int i=2; i<=9; i++) {
			System.out.print("["+i+"´Ü"+"]"+"\t");
			
		}
		System.out.println();
		for(int i=1; i<10; i++) {
		for(int j=2; j<=9; j++) {
			System.out.print(j+" X "+i+"="+i*j+" ");
		}
		System.out.println();
		}
		
}
}