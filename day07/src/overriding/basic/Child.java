package overriding.basic;

public class Child extends Parent{

	/*
	 * 메서드 오버라이딩 - 부모한테 물려받은 메서드를 내용물만 바꿔서 재정의 하는것
	 * 규칙- 메서드는 공일하게 만들고 내용을 변경하면 됩니다.
	 */

	void method02() {
		System.out.println("자식님의 재정의된 2번 메서드");	
	}
	void method03() {
		System.out.println("자식의 3번 메서드");
	}
}
