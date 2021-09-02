package math;

import java.util.Scanner;

public class num1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		
		long cost = A;
		int cnt= 0;
		while(true) {
			
			if (B >= C) {
				cnt= -1;
				break;
			}
			
			cost += B;
			cost -= C;
			cnt++;
			if (cost <0) {
				break;
			}
			
		}
		System.out.println(cnt);
	}
	
}
