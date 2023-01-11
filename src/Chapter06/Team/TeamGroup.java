package Chapter06.Team;

public class TeamGroup {

	//멤버변수
	private TeamMember member[] = new TeamMember[6];
	
	//기본 생성자
	
	//초기화 메소드
	public void init() {
		member[0]=new TeamMember("박창훈", "M");
		member[1]=new TeamMember("이석진", "M");
		member[2]=new TeamMember("박창우", "M");
		member[3]=new TeamMember("한성무", "M");
		member[4]=new TeamMember("장준근", "M");
		member[5]=new TeamMember("이세정", "F");
	}
	//출력 메소드
	
	public void Disp() {
		for(int i=0; i<member.length; i++) {
			System.out.println("성명 : "+member[i].getName()+"\t성별 : "+member[i].getGender());
		}
	}
	
		
	
}
