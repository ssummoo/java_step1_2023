package Chapter06.Team;

public class TeamMain {

	public static void main(String[] args) {
	
		TeamGroup tg=new TeamGroup();
		TeamMember tm=new TeamMember();
		//�޼ҵ带 ���ؼ� ������ �ʱ�ȭ
		
		tm.setTeamName("7��8D");
		System.out.println("���� : "+ tm.getTeamName());
		System.out.println("====================");
		System.out.println("-----[���� ���]------");
		tg.init();
		tg.Disp();
		
		tm.setmName("��â��");
		tm.setMphone("010-9186-0744");
		tm.setsName("�̼���");
		System.out.println("���� : "+tm.getmName()+"\t��ȭ��ȣ : "+tm.getMphone());
		System.out.println("������ : "+tm.getsName());

	}

}
