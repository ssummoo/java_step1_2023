package chapter04;

public class Book {

	public String bookname; //멤버변수
	public String author;
	//public -> main이 있는 class에서 공통적으로 사용가능 
	
	//디폴트 생성자
	public Book() {
	
	}
	
	public Book(String bookname, String author) {
		this.bookname=bookname; //this.->원형으로(Initial)
		this.author=author;
		
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//사용자정의
	public void showBookinfor() {
		System.out.println("책이름 : "+bookname+" | 저자 : "+author);
		
	}
	
	
	
	
}
