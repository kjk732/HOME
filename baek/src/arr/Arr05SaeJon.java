package arr;

import java.util.Arrays;
import java.util.Scanner;

public class Arr05SaeJon {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt(); //과목 개수
		double[] arr = new double[S];
		
		for (int i = 0 ; i < S ; i++) {
			
			int N = sc.nextInt();
			arr[i] = N;
		
		}
		Arrays.sort(arr);
		
		double M = arr[arr.length-1]; //최고점 과목
		double avg = 0;
		double sum = 0 ;
		
		for (int i = 0 ; i < S ; i++) {
			
				arr[i] = arr[i] / M *100;
				
				sum += arr[i];
		}
		avg = sum / S;
	
		System.out.println(avg);
	}
}
