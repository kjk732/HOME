package quiz01;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		//1. 1~100까지 정수중에 3의 배수이거나, 4의 배수일경우에 가로로 출력
		int a = 1;
		while(a <= 100) {
			if(a % 3 == 0 || a % 4 == 0)
				System.out.print(a + " ");
			
			a++;
		}
		System.out.println(); //개행
		
		
		//2. 1~200까지 정수중 5의 배수의 합.
		int sum = 0;
		
		int x = 1;
		while(x <= 200) {
			if(x % 5 == 0) {
				sum+=x;
			}
			x++;
		}
		System.out.println("200까지 5의 배수의 합:" + sum);
		
		//3. 1~200까지 정수중의 4의 배수이면서 8의 배수가 아닌 수의 개수
		int i = 1;
		int count = 0;
		while(i <= 200) {
			if(i % 4 == 0 && i % 8 != 0) {
				count++;
			}
			i++;
		}
		System.out.println("200까지 개수:" + count);
		
		//4. 두 정수를 입력받아서 두 정수 사이의 합(같은 경우는 없다고 가정)
		//입력값: 5, 1 -> 출력값: 1+2+3+4+5 = 15

		//큰수, 작은수를 먼저 구별 -> 반복문
		
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int num1 = scan.nextInt();
		System.out.print(">");
		int num2 = scan.nextInt();
		
		int max = num1 > num2 ? num1: num2;
		int min = num1 < num2 ? num1: num2;
		
		int result = 0;
		while(min <= max) {
			result += min;
			min++;
		}
		
		System.out.println("두수의 합:" + result);
		
		
		
		
	}
}
