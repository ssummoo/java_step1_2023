package Chapter07.Person;

public class PersonMain {

	public static void main(String[] args) {

		Person personkim=new Person();
		System.out.println(personkim.name="김유신");
		System.out.println(personkim.height=180f);
		System.out.println(personkim.weight=80f);
		System.out.println("============================");
		
		Person personKang=new Person("강감찬");
		System.out.println(personKang.name);
		System.out.println(personKang.height=175f);
		System.out.println(personKang.weight=75f);
		System.out.println("============================");
		
		Person personLee=new Person("이순신", 170f, 70f);
		System.out.println(personLee.name);
		System.out.println(personLee.height);
		System.out.println(personLee.weight);
		System.out.println("============================");
		
		
		

	}

}
