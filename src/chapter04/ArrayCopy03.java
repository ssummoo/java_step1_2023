package chapter04;

public class ArrayCopy03 {

	public static void main(String[] args) {
		
	//BookŬ������ �迭����� 3��
		Book bookArray1[]=new Book[3]; //����
		Book[] bookArray2=new Book[3];
		
		//�ʱ�ȭ
		bookArray1[0]=new Book("�鼳����","�׸�����");
		bookArray1[1]=new Book("���ΰ� �ٴ�","��ֿ���");
		bookArray1[2]=new Book("�ι̿��� �ٸ���","���ͽ��Ǿ�");

		//bookArray2 ��ü ����
		
		bookArray2[0]=new Book();
		bookArray2[1]=new Book();
		bookArray2[2]=new Book();
		
		//����
		System.out.println("==========����(bookArrary1)=============");
		for(int i=0; i<bookArray1.length;i++) {
			bookArray1[i].showBookinfor();
		}//for
		//���� ����
		for(int i=0; i<bookArray1.length;i++) {
			bookArray2[i].setBookname(bookArray1[i].getBookname());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		//���纻
		 System.out.println("==========���纻(bookArrary2)=============");
		 for(int i=0; i<bookArray2.length;i++) {
			 bookArray2[i].showBookinfor();
			 }
		 System.out.println();
	 	//===============================================
		 System.out.println();
		 bookArray1[0].setBookname("����");
		 bookArray1[0].setAuthor("�ڿϼ�");
		 
		 System.out.println("==========��������(bookArrary1)=============");
		 for(int i=0; i<bookArray1.length;i++) {
			 bookArray1[i].showBookinfor();
		 }//for
		 
		 System.out.println();
		 
		 System.out.println("==========���纻(bookArrary2)=============");
		 for(int i=0; i<bookArray2.length;i++) {
			 bookArray2[i].showBookinfor();
		 }//for
		 
		 
	}

}
