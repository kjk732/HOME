package day05;

public class MethodEx03 {

	public static void main(String[] args) {
		
		/*
		 * 반환유형
		 * 1. 반환유형은 메서드가 실행한 결과를 돌려주는 값에 대한 type입니다.
		 * 2. 반환유형이 있는 메서드는 호출문이 하나의 값이기 때문에 다른 메서드의 매개값으로 전달이 됩니다.
		 * 	  ex) println( )
		 * 3. 반환유형이 없는 메서드는 반환유형 자리에 void라고 적습니다.
		 * 4. 모든 메서드는 return을 만나면 메서드의 종료입니다. 때문에 return아래에 코드작성이 불가능합니다.
		 */
		
//		System.out.println( sum(1, 2) );
		int result = sum( sum(1,2), sum(3,4)  );
		System.out.println("결과:" + result);
		
		
//		System.out.println( sum2(1, 2) );
//		int a = sum2(1, 2);
		sum2(1, 2);
		sum3();
		
		noReturn("짜장면먹고싶네");
	}
	
	static int sum(int a, int b) {
		return a + b;
	}
	static void sum2(int a, int b) {
		System.out.println(a + "+" + b + "=" + (a+b) );
	}
	static void sum3() {
		System.out.println("3 + 1 = 4");
	}
	static void noReturn(String s) {
		//특정조건에 부합할 때 함수의 종료
		
		if(s.equals("짜장면먹고싶네")) {
			System.out.println("맛잇게 드세요~!");
			return; //즉시 함수의 종료
		}
		
		System.out.println("짜장면먹고싶네 를 전달하세요");
	}
	
	
	
	
}
