package chapter04;

public class BookArray02 {

	public static void main(String[] args) {

		//Book(); 5�� ȣ��
		Book library[]=new Book[5];
		
		library[0]=new Book("���̾�","�츣�� �ؼ�");
		library[1]=new Book("�����Ӹ���","����޸�");
		library[2]=new Book("�鼳����","�׸�����");
		library[3]=new Book("���ΰ� �ٴ�","��ֿ���");
		library[4]=new Book("�ι̿��� �ٸ���","���ͽ��Ǿ�");
		
		//library[0].showBookinfor();
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookinfor();
			System.out.println();
		}
	}

}
