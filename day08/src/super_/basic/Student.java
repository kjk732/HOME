package super_.basic;

public class Student extends Person {

	String studentId;

	Student(String name, int age, String studentId) {
//		super(); //문법
//		this.name = name;
//		this.age = age;
		super(name, age);
		this.studentId = studentId;
	}
	
	
	String info() {
		return super.info() + ", 학번:" + studentId;
	}
}
