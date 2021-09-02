package quiz01;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
		System.out.println( java(3) ); //문자붙이기
		System.out.println( sum(5) ); //약수의합
		System.out.println( primeNum(10) ); //소수의개수: 2,3,5,7
		System.out.println( sumNum(1, 5) );
		System.out.println( sumNum(5, 1) );
		System.out.println( sumNum(5, 5) );
		
		System.out.println( test(10230543) );
		System.out.println( test(1111) );
		System.out.println( test(1000) );
		System.out.println( test(1023) );
		System.out.println( test(453) );
		System.out.println( test(4530) );
	}
	
	static String java(int a) {
		
		String str = "";
		for(int i = 1; i <= a; i++) {
//			if(i % 2 == 1) {
//				str += "자";
//			} else {
//				str += "바";
//			}
			str = i % 2 == 1 ? (str += "자") : (str += "바");
		} 
		
		return str;
	}
	
	static int sum(int a) {
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) 
				sum +=i;
		}
		return sum;
	}
	
	static int primeNum(int a) {
		
		int sum = 0; //소수의 개수
		for(int i = 1; i <= a; i++) {
			
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			
			if(count == 2) sum++;		
			
		}
		return sum;
	}
	
	static int sumNum(int a, int b) {
		
		int max = a > b ? a : b;
		int min = b > a ? a : b;
		int sum = 0;
		for(int i = min ; i <= max; i++ ) {
			sum += i;
		}
		
		return sum;
	}
	
	static int test(int a) {
		/*
		 * 자연수 자리수의 합 구하기
		 * 자연수 n이 매개변수로 주어지면 n자리수의 합을 구해서 return하는 메서드
		 * 조건
		 * n은 1억 이하의 자연수
		 * n의 자료형을 바꾸면 안됩니다.
		 * 
		 * ex)10230543 -> 18
		 */
		int sum = 0;
		for(int i = 10000000; i >= 1; i/=10 ) {
			if(a / i != 0) { //몫이 있는경우
				sum += (a / i); //몫을 구해서 누적
				a %= i;
			}
		}
		return sum;
	}


	
	
	
	
}
