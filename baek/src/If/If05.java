package If;

import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int C = M-45;
		int D = 60 + C;
		if(C < 0) {
			H -= 1;
				if(H >= 0)
					System.out.println(H + " " + D );
				else {
					H = 23;
					System.out.println(H + " " + D );
				}
		} else {
			
			System.out.println(H + " " + C);
		}
		sc.close();
			
	}
}
