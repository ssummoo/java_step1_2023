package Chapter06.Team;

public class TeamMain {

	public static void main(String[] args) {
	
		TeamGroup tg=new TeamGroup();
		TeamMember tm=new TeamMember();
		//메소드를 통해서 팀명을 초기화
		
		tm.setTeamName("7전8D");
		System.out.println("팀명 : "+ tm.getTeamName());
		System.out.println("====================");
		System.out.println("-----[팀원 명단]------");
		tg.init();
		tg.Disp();
		
		tm.setmName("박창훈");
		tm.setMphone("010-9186-0744");
		tm.setsName("이석진");
		System.out.println("팀장 : "+tm.getmName()+"\t전화번호 : "+tm.getMphone());
		System.out.println("부팀장 : "+tm.getsName());

	}

}
