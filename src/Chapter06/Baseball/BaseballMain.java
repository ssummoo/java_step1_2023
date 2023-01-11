package Chapter06.Baseball;

public class BaseballMain {

	public static void main(String[] args) {
		BaseballGame game=new BaseballGame();
		
		String check = "";
				
		do {
			check = game.check;
		}while(check!="WIN");
		
	}

}
