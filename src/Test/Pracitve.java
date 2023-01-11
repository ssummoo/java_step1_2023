package Test;

public class Pracitve {
	public static void main(String[] args) {
		
	/*
	int Arr1[]= {1,2,3,4,5};
	int Arr2[]= {10, 20, 30, 40, 50};
	
	System.arraycopy(Arr1, 1, Arr2, 3, 2);
	for(int i=0; i<Arr1.length;i++) {
		System.out.print(Arr2[i]+"  ");
	}
	 */
		String str1[]= {"가","나","다"};
		String str2[]=new String[3];
		
		/*
 
		System.arraycopy(str1, 0, str2, 0, str1.length);
		for(int i=0;i<str1.length;i++) {
			System.out.print(str2[i]+"\t");
		}
		 */
		//역순으로 복사
		for(int i=0; i<str1.length;i++) {
				str2[i]=str1[(str1.length-1)-i];
			System.out.print(str2[i]+"\t");
		}
		
		
	}//m
}
