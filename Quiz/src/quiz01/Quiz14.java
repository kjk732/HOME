package quiz01;

public class Quiz14 {

	public static void main(String[] args) {
		//1. 랜덤수 2~9랜덤 정수를 만들고, 구구단 출력
		int ran = (int)(Math.random() * 8) + 2;
		for(int i = 1; i <= 9; i ++) {
			//System.out.println(ran + "x" + i + "=" + ran*i);
			System.out.printf("%d x %d = %d\n", ran, i, ran*i);
		}

		//2. 50~100까지 두 수 사이의 합.
		int sum = 0;
		for(int i = 50; i <= 100; i++) {
			sum +=i;
		}
		System.out.println("합계:" + sum);
		
		//3. A~Z까지 문자를 가로로 출력 (A=65 Z=90)
		for(char c = 'A'; c <= 'Z'; c++) {
			
			System.out.print(c + " ");
		}

		System.out.println();
		//4. 200까지 정수중의 if문을 사용하지 않고 짝수만 출력.
		for(int i = 2; i <= 200; i+=2) {
			System.out.print(i + " ");
		}
		
		
		
		
		
		
	}
}
