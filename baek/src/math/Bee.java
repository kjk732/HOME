package math;

import java.util.Scanner;

public class Bee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long N = sc.nextLong();
		long cir = 0;
		long r = 0;
		
		while(true) {
			
			cir += 6*r;
			
			if ( (N - (1 +cir)) <=0) { 
				r++;
				break;
			}else {
				r++;
			}	
		}
		System.out.println(r);
	}
}
