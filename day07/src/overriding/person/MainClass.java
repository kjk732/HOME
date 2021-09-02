package overriding.person;

public class MainClass {

	public static void main(String[] args) {
		
		// 학생, 직원, 선생님을 객체로 생성해서 이름 나이 학번을 저장하고
		//부모한테 물려받은 기능을 확인해보세요
		
		//학생, 직원, 선생님을 객체의 info메서드를 각 변수에 알맞게 오버라이딩 해서 확인해주세요
		
		Student s = new Student();
		s.age = 20;
		s.name = "홍길동";
		s.studentId = "20001212";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.age = 30;
		t.name = "이순신";
		t.subject = "프로그램";
		
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.age = 40;
		e.name = "홍길자";
		e.department = "회계부";
		
		System.out.println(e.info());
	}
}
