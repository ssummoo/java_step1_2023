package chapter04;

public class ArgsTest {

	public static void main(String[] args) {
		
		/*
		int a=1; 
		int b=2; 
		int c=3; 
		int d=4; 
		int e=5; 
		int f=6; 
		System.out.println(a+b+c+d+e+f);
		 */
		
		//�迭����1
		
		int a[]=new int[5]; //Fixed-length
		
		//�迭����2
		int b[]; //����
		b=new int[5];
		
		int aVal;
		int bVal;
		int Tot;
		
		//�迭����3
		args=new String[2];//main���� �̹� ���� �������� ��밡��
		args[0]="1";//[0]:÷�� / "1":���
		args[1]="2";
		
		//length : �迭�� ÷��(�޸�) ��
		if(args.length == 2) {
			aVal=Integer.parseInt(args[0]);
			bVal=Integer.parseInt(args[1]);
		}//if
		else {
			aVal=0;
			bVal=0;
			
		}//else
		Tot=aVal+bVal;
		System.out.println(aVal);
		System.out.println(bVal);
		System.out.println(Tot);
		
		
	}//main

}//class
