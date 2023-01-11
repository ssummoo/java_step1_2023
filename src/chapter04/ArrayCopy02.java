package chapter04;

public class ArrayCopy02 {

	public static void main(String[] args) {
		//얕은 복사 
		//Book bookArray1 3개의 배열 선언
		Book bookArray1[]=new Book[3];

		//Book bookArray2 3개의 배열 선언
		Book bookArray2[]=new Book[3];
		
		//초기화
		bookArray1[0]=new Book("백설공주","그림형제");
		bookArray1[1]=new Book("노인과 바다","헤밍웨이");
		bookArray1[2]=new Book("로미오와 줄리엣","셰익스피어");
		
		System.out.println("==========원본(bookArrary1)=============");
		for(int i=0; i<bookArray1.length;i++) {
			bookArray1[i].showBookinfor();
		}//for
		
		//복사
		 System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		 System.out.println("==========복사본(bookArrary2)=============");
		 for(int i=0; i<bookArray2.length;i++) {
			 bookArray2[i].showBookinfor();
			 }
		 
	
	
		 System.out.println();
		 bookArray1[0].setBookname("나목");
		 bookArray1[0].setAuthor("박완서");
		 
		 System.out.println("==========원본변경(bookArrary1)=============");
		 for(int i=0; i<bookArray1.length;i++) {
			 bookArray1[i].showBookinfor();
		 }//for
		 
		 System.out.println();
		 
		 System.out.println("==========복사본(bookArrary2)=============");
		 for(int i=0; i<bookArray2.length;i++) {
			 bookArray2[i].showBookinfor();
		 }//for
		 
		
	}//main

}

