package Chapter07.Korean;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean k1=new Korean("���ڹ�", "010-1111-1111");
		System.out.println("nation : "+k1.nation);
		System.out.println("name : "+k1.name);
		System.out.println("ssn : "+k1.ssn);
		System.out.println("---------------------------------");
		
		Korean k2=new Korean("���ڹ�", "010-2222-2222");
		System.out.println("nation : "+k2.nation);
		System.out.println("name : "+k2.name);
		System.out.println("ssn : "+k2.ssn);
		
	}

}
