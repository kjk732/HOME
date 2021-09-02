package this_.basic;

public class Person {
	
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println("누구로 생성하던 이문장을 실행");
	}
	
	Person(String name) {
		this(name, 1);
//		this.name = name;
//		this.age = 1;
	}
	
	Person() {
		this("이름미정", 1);
//		this.name = "이름미정";
//		this.age = 1;
	}
	
	
	String info() {
		return "이름:" + this.name + ", 나이:" + this.age;
	}
	
}
