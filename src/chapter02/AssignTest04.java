package chapter02;

public class AssignTest04 {
		public static void main(String[] args) {
		//전위연산
			System.out.println("========전위연산=======");
			int gameScore=150;
			int lastScore1=++gameScore;
			System.out.println(lastScore1); //151
			System.out.println("================");
			int lastScore2=--gameScore;
			System.out.println(lastScore2); // 150
			
			//후위연산
			System.out.println("========후위연산=======");
			int lastScore3=gameScore++;
			System.out.println(lastScore3); //150
			System.out.println(gameScore); //151
			System.out.println("================");
			
			
			
			
			
			
			
		}
}
