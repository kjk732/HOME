package quiz01;

import java.util.Scanner;

public class Quiz19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력>");
		int num = scan.nextInt();

		
		int sum = 0; //합을 누적할 변수
		for(int i = 1; i <= num; i++) {
			int count = 0; //약수의 개수를 판별 (값을 판별하기 전에 카운트값 초기화)
			//i값을 판별
			for(int j = 1; j <= i; j++) {
				
				if(i % j == 0) {
					count++;
				}
			}
			
			if(count == 2) { //i의 약수의 개수가 2개 이므로 i는 소수이다.
				sum +=i;
			}
						
		}
		
		System.out.println("1에서" + num + "까지합:" + sum );
		
		
		
		
		
	}
}
