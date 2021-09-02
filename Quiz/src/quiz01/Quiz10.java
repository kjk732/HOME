package quiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("구구단 단수:");
		int dan = scan.nextInt();
		
		System.out.println("구구단 " + dan + "단");
		System.out.println("-----------------");
		
		int a = 1;
		while(a <= 9) {
			
			System.out.println(dan + " x " + a + " = " + dan*a);
			
			a++;
		}
		

		
	}
}
