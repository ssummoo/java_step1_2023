package chapter05;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class Funtest04 {
	//매개변수로 배열사용
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
		JOptionPane.showMessageDialog(null, "배열의 원소값\n\n"+res);
	}

	public static void main(String[] args) {
		
		String str[]= {"Java", "Oracle", "Jsp", "Html5, Css, Js, Jq", "SprintBoot", "PythonCamp"};
		Dsp(str);
		

	}

}
