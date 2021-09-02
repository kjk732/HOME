package day05;

public class MethodEx01 {

	public static void main(String[] args) {
		//메서드는 메서드 내부에 만들 수 없습니다.
		//main밖, class안 어디서든 선언할 수 있습니다.
		
		System.out.println("1~10까지 합:" + calSum() );
		System.out.println("1~10까지 합:" + calSum() );
		int sum = calSum(); //반환이 있는 메서드는 결과를 받아서 사용할 수 있다
		System.out.println("결과:" + sum);

		String str = randomStr();
		System.out.println("결과:" + str);
		
		char c = randomStr2();
		System.out.println("결과:" + c);
	}
	
	static int calSum() {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum; //반환
	}
	static String randomStr() {
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		
		return str;
	}
	static char randomStr2() {
		char c = 0;
		
		double d = Math.random(); //0~1미만
		if( d > 0.66) {
			return 'A';
		} else if( d > 0.33) {
			return 'B';
		} else {
			return 'C';
		}
				
//		return c;
	}
	
	
	
}
