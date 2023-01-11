package Chapter06.Can;

public class Vending {

	// �������
	private Can can[] = new Can[5];
	private int money;

	// ��ü�ʱ�ȭ
	// can[0]=new Can("ȯŸ",1000); <- private�������̹Ƿ� �ʱ�ȭX �޼ҵ� �ȿ��� �ʱ�ȭ�Ѵ�

	// Method
	public void init() {
		can[0] = new Can("ȯŸ", 1000); // Method ���� Main���� ȣ�Ⱑ��
		can[1] = new Can("���", 1200);
		can[2] = new Can("������", 800);
		can[3] = new Can("��Ÿ500", 500);
		can[4] = new Can("��ī������Ʈ", 1500);
	}

	// ��� ������ ���Ḹ �����ֱ�
	public void showCans(int m) {
		money = m;

		for (int i = 0; i < can.length; i++) {
			// ���� ���� �� �Ǵ�
			if (can[i].getPrice() <= money) {
				System.out.println(can[i].getCanName() + " - " + can[i].getPrice());
			} // if

		} // for

	}// method

	// ������ ����� ������ �ܾ�
	public void outcan(String name) {
		for (int i = 0; i < can.length; i++) {
			if (can[i].getCanName().equals(name)) {
				System.out.println(can[i].getCanName() + " ����");
				System.out.println("�� �� : " + (money - can[i].getPrice() + "��"));
			}
		} // for
	}// outcan
}