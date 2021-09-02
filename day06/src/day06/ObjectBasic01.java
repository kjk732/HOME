package day06;

public class ObjectBasic01 {

	public static void main(String[] args) {
		//기존에 사용하던 방법
		
		System.out.println("===1번 계산기===");
		System.out.println( add(5));
		System.out.println( add(10));
		System.out.println( add(3));
		
		System.out.println("===2번 계산기===");
		System.out.println( add2(10));
		System.out.println( add2(20));
	
		
	}
	
	//1번 계산기
	static int result = 0;
	static int add(int a) {
		
		result += a;
		return result;
		
	}
	
	//2번 계산기
	static int result2 = 0;
	static int add2(int a) {
		
		result += a;
		return result;
		
	}
}

