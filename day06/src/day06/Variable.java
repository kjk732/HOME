package day06;

public class Variable {

	//초기화 하지 않더라도 기본값으로 자동 초기화 (0, 0.0 , false, null)
	
	int a;
	
	void printNumber(int c) {
		
		int b =1 ; 
		System.out.println("멤버변수: " + a);
		System.out.println("지역변수: " + b);
		System.out.println("매개변수: " + c);
	}
	
}
