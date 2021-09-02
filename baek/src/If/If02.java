package If;

import java.util.Scanner;

public class If02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a <= 100 & a >= 90)
			System.out.println("A");
		else if(90> a & a >= 80)
			System.out.println("B");
		else if(80> a & a >= 70)
			System.out.println("C");
		else if(70> a & a >= 60)
			System.out.println("D");
		else if (a < 60)
			System.out.println("F");
		sc.close();
	}

}
