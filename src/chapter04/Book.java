package chapter04;

public class Book {

	public String bookname; //�������
	public String author;
	//public -> main�� �ִ� class���� ���������� ��밡�� 
	
	//����Ʈ ������
	public Book() {
	
	}
	
	public Book(String bookname, String author) {
		this.bookname=bookname; //this.->��������(Initial)
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
	
	//���������
	public void showBookinfor() {
		System.out.println("å�̸� : "+bookname+" | ���� : "+author);
		
	}
	
	
	
	
}
