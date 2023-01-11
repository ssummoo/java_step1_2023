package chapter04;

import javax.swing.JOptionPane;

public class TwoDimensions02 {

	public static void main(String[] args) {
		// 
		int JavaScore[][]=new int[2][3];		
		
		for(int i=0; i<JavaScore.length;i++) {
			for(int j=0; j<JavaScore[i].length;j++) {
				int jumsu=Integer.parseInt(JOptionPane.showInputDialog("점수를 입력하세요"));
				JavaScore[i][j]=jumsu;
				System.out.print("JavaScore["+i+"]"+"["+j+"] : "+JavaScore[i][j]+"\t");
			}//for
			System.out.println();
		}//for

	}//main

}//class
