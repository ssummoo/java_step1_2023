package Chapter06.Team;

public class TeamGroup {

	//�������
	private TeamMember member[] = new TeamMember[6];
	
	//�⺻ ������
	
	//�ʱ�ȭ �޼ҵ�
	public void init() {
		member[0]=new TeamMember("��â��", "M");
		member[1]=new TeamMember("�̼���", "M");
		member[2]=new TeamMember("��â��", "M");
		member[3]=new TeamMember("�Ѽ���", "M");
		member[4]=new TeamMember("���ر�", "M");
		member[5]=new TeamMember("�̼���", "F");
	}
	//��� �޼ҵ�
	
	public void Disp() {
		for(int i=0; i<member.length; i++) {
			System.out.println("���� : "+member[i].getName()+"\t���� : "+member[i].getGender());
		}
	}
	
		
	
}
