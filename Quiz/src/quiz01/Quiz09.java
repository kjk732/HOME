package quiz01;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		
		//간단한 사칙연산이 되는 프로그램
		Scanner scan = new Scanner(System.in);

		System.out.print("정수1>");
		int n1 = scan.nextInt();
		
		System.out.print("연산을 선택하세요[+, -, *, /]>");
		String oper = scan.next();
		
		System.out.print("정수2>");
		int n2 = scan.nextInt();
		
		
		
		switch (oper) {
		case "+":
			System.out.println("두 수의 덧셈은: " + (n1 + n2) );
			break;
		case "-":
			System.out.println("두 수의 뺄셈은: " + (n1 - n2) );
			break;
		case "*":
			System.out.println("두 수의 곱셈은: " + (n1 * n2) );
			break;
		case "/":
			System.out.println("두 수의 나눗셈은: " + (n1 / n2) );
			break;
		default:
			System.out.println("사칙연산 기호를 입력해 주세요.");
			System.out.println("[+, -, x, /]");
			break;
		}
	}
}
