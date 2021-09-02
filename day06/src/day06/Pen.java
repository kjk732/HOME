package day06;

// 설계도 클래스는 main이 없습니다.
public class Pen {
	
	//멤버변수 - 클래스의 속성을 나타냅니다. (필드)
	String ink;
	int price;
	String company;
	
	//메서드 - 클래스의 기능을 나타냅니다.(값의 변경도 메서드안에서) 
	void write() { 
		System.out.println(ink + "색상 글씨를 씁니다.");
	}
	
	void info() {
		System.out.println("=====펜의 정보 =====");
		System.out.println("색상: " + ink);
		System.out.println("가격: " + price);
		System.out.println("제조사: " + company);
	}
}
