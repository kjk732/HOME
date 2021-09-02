package quiz01;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0; //합계변수
		int a = 1;
		while(a != 0) {
			
			System.out.print(">");
			a = scan.nextInt();
			sum += a;
		}
		
		System.out.println("합:" + sum);
		scan.close();
		
		
	}
}
