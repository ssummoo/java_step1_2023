package chapter04;

public class BookArray02 {

	public static void main(String[] args) {

		//Book(); 5번 호출
		Book library[]=new Book[5];
		
		library[0]=new Book("데미안","헤르만 해세");
		library[1]=new Book("빨간머리앤","몽고메리");
		library[2]=new Book("백설공주","그림형제");
		library[3]=new Book("노인과 바다","헤밍웨이");
		library[4]=new Book("로미오와 줄리엣","셰익스피어");
		
		//library[0].showBookinfor();
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookinfor();
			System.out.println();
		}
	}

}
