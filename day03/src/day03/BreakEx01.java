package day03;

import java.util.Scanner;

public class BreakEx01 {

	public static void main(String[] args) {
		
		/*
		 * 무한반복문
		 * - 반복문의 횟수를 정확히 모를때 사용하고, 자바에서는 while(true)문장을 사용합니다.
		 * - 특정조건에서 반복문을 탈출하는 형태로 사용합니다.
		 */
		
//		int i = 0;
//		while(true) {
//			
//			System.out.println(i);
//			
//			if(i == 15) break;
//			i++;
//		}
		
		
		System.out.println("----------------------------------");
		
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("4 + 3 = ?");
			System.out.print(">");
			int answer = scan.nextInt();
			
			if(answer == 7) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("틀렸는데요?");
			}
			
			
		}
		
		
		
		
		
		
	}
}
