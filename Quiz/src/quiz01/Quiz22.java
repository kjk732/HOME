package quiz01;

import java.util.Scanner;

public class Quiz22 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int okCount = 0;
		int noCount = 0;
		
		while(true) {
			
			int num1 = (int)(Math.random() * 100) + 1;
			int num2 = (int)(Math.random() * 100) + 1;
			int oper = (int)(Math.random() * 2); //0, 1
			
			
			System.out.println("--------------------");
			System.out.println(num1 + (oper == 1 ? " + " : " - ") + num2 + " = ?" );
			System.out.println("[문제를 중단하려면 0을 입력하세요]");
			System.out.print(">");
			
			int answer = scan.nextInt(); 
			int result = (oper == 1 ? num1 + num2 : num1 - num2);
			
			if(answer == 0 && result != 0) break; //그만

			if(answer == result) {
				System.out.println("정답입니다");
				okCount++;
			} else {
				System.out.println("오답입니다");
				noCount++;
			}
			
		}
		
		System.out.println("오답:" + noCount);
		System.out.println("정답:" + okCount);
		
		
		
		
		
		
	}
}
