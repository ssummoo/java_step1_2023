package chapter04.Example;

public class Example02 {

	public static void main(String[] args) {
		
		// ȸ�������� 0������ ȸ����ȣ�� �ο��ȴ� 
		//���� �ο��� ������ ��ȣ�� ���� ū ȸ����ȣ�� ����Ͻÿ�

		
		int array[]= {1,6,9,2,35,178,234,4,5,11};
		int max=array[0], min=array[0];
		
		//�ִ밪 �˰���
		for(int i=0; i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
				
			}
			//if

			if(min>array[i]) {
				min=array[i];
			}
			
		}//for
		System.out.println("����ū ȸ����ȣ : "+max);
		System.out.println("���� ���� ȸ����ȣ : "+min);
		
		
	}//m

}
