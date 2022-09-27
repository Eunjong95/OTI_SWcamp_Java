package ch16.sec05.exam03;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();

		Member m1 = person.getMember1((id) -> {
			Member m = new Member(id);
			return m;
		});

		m1 = person.getMember1((id) -> new Member(id));
		m1 = person.getMember1(Member::new);

		System.out.println(m1);

		System.out.println();

		Member m2 = person.getMember2((id, name) -> {
			Member m = new Member(id, name);
			return m;
		});

		m2 = person.getMember2((id, name) -> new Member(id, name));
		m2 = person.getMember2(Member::new);
		
		System.out.println(m2);
	}
}
