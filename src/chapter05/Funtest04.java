package chapter05;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Funtest04 {
	//�Ű������� �迭���
	public static void Dsp(String A[]) {
		String res="";
		
		for(int i=0; i<A.length; i++) {
			res+=A[i]+"\n";
			
		}//f
		/*
		 * 
		for(String str : A) {
			res+=str+" ";
		}
		 */
		System.out.println(res);
		JOptionPane.showMessageDialog(null, "�迭�� ���Ұ�\n\n"+res);
	}

	public static void main(String[] args) {
		
		String str[]= {"Java", "Oracle", "Jsp", "Html5, Css, Js, Jq", "SprintBoot", "PythonCamp"};
		Dsp(str);
		

	}

}
