package chapter04;

public class ArrayCopy02 {

	public static void main(String[] args) {
		//���� ���� 
		//Book bookArray1 3���� �迭 ����
		Book bookArray1[]=new Book[3];

		//Book bookArray2 3���� �迭 ����
		Book bookArray2[]=new Book[3];
		
		//�ʱ�ȭ
		bookArray1[0]=new Book("�鼳����","�׸�����");
		bookArray1[1]=new Book("���ΰ� �ٴ�","��ֿ���");
		bookArray1[2]=new Book("�ι̿��� �ٸ���","���ͽ��Ǿ�");
		
		System.out.println("==========����(bookArrary1)=============");
		for(int i=0; i<bookArray1.length;i++) {
			bookArray1[i].showBookinfor();
		}//for
		
		//����
		 System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		 System.out.println("==========���纻(bookArrary2)=============");
		 for(int i=0; i<bookArray2.length;i++) {
			 bookArray2[i].showBookinfor();
			 }
		 
	
	
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
		 
		
	}//main

}

