package arr;

import java.util.Scanner;

public class Arr07Avr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		int i = 1;
		
		while(i <= testcase ) {
			
			int sum = 0;
			double avg = 1;
			double count = 0;
			double result = 0;
			
			int circle = sc.nextInt();
			
			int[] arr = new int[circle];
			
			for (int j = 0 ; j < circle ; j++  ) {
				
				arr[j] = sc.nextInt();
				
			}
			for (int x : arr) {
				sum += x;
			}
			
			avg = sum / arr.length;
			
			for( int k = 0 ; k < circle ; k++) {
				if( arr[k] > avg) {
					count++;
				}
			}
			
			result = (count / arr.length) *100;
			
			String s = String.format("%.3f" , result);
			
			System.out.println(s + "%");
			i++;
		}
		
		
	}
}
