package For;

import java.util.Scanner;

public class For07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int F = N / 10;
		int S = N % 10;
		int NN = 0;
		int count = 0;
		int SUM = (F+S) % 10;
		
		if(N >= 1 && N <= 99) {
			
			while (NN != N) {
				
				NN = S*10 + SUM;
				
				F = NN / 10;
				S = NN % 10;
				SUM = (F+S) % 10;
				
				count++;	
			} 
			
			System.out.println(count);
			
		} else if(N == 0){
			
			System.out.println(1);
			
			
		}
		sc.close();
	}
		
}

