package Test;

import java.util.Random;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int com[]=new int[3];
					
			//1에서 9사이의 난수 발생
			for(int i=0; i<com.length; i++) {
				com[i]=new Random().nextInt(9)+1;
				for(int j=0; j<com.length; j++) {
					if(com[i]==com[j]){
						i--;
						System.out.print(com[i]+"\t");
						break;
					}
				}
				
			}
			for(int i=0; i<3; i++) {
				
			System.out.println(com[i]);	
			}
			

		
}
}