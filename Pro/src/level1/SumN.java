package level1;

import java.util.Scanner;

public class SumN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		System.out.println(sum(t));
		
	}
	
	static int sum(int a) {
		int sum = 0;
		
		for ( int i = 1 ; i <= 9 ; i++ ) {
			sum += (a % 10);
			a /= 10;
		
		}
		
		return sum;
	}
}
