package overriding.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.method01();
		p.method02();
		
		Child c = new Child();
		c.method01();// 물려받은
		c.method02();// 오버라이딩
		c.method03();// 자신의 메서드
		
	}
}
