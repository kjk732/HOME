package baek;

import java.util.Scanner;

public class While_baek {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = 1;
		
		while(t <= 5) {
			
			int a = sc.nextInt();		
			int b = sc.nextInt();
			
			System.out.print(a + b);
			t++;
		}
		sc.close();
	}
}
