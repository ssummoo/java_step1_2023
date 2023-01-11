package chapter04;

public class ArrayCopy03 {

	public static void main(String[] args) {
		
	//Book클래스의 배열만들기 3개
		Book bookArray1[]=new Book[3]; //선언
		Book[] bookArray2=new Book[3];
		
		//초기화
		bookArray1[0]=new Book("백설공주","그림형제");
		bookArray1[1]=new Book("노인과 바다","헤밍웨이");
		bookArray1[2]=new Book("로미오와 줄리엣","셰익스피어");

		//bookArray2 객체 생성
		
		bookArray2[0]=new Book();
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		//원본
		System.out.println("==========원본(bookArrary1)=============");
		for(int i=0; i<bookArray1.length;i++) {
			bookArray1[i].showBookinfor();
		}//for
		//깊은 복사
		for(int i=0; i<bookArray1.length;i++) {
			bookArray2[i].setBookname(bookArray1[i].getBookname());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		//복사본
		 System.out.println("==========복사본(bookArrary2)=============");
		 for(int i=0; i<bookArray2.length;i++) {
			 bookArray2[i].showBookinfor();
			 }
		 System.out.println();
	 	//===============================================
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
		 
		 
	}

}
