package arr;

import java.util.Arrays;
import java.util.Scanner;

public class Arr04ABC {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 1;
		
		for(int i = 0 ; i < 10 ; i++) {//자연수 뽑기
		int N = sc.nextInt();
		arr[i] = N;
		arr[i] = arr[i] % 42;
		}
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i < 10 ; i++) { // 나머지 비교하기
				
			for (int j = i+1; j <10 ; j++) {
				
				if(arr[i] != arr[j]){
					count ++;
					i = j;
				}
			}
			}
			
			
		
		System.out.println(count);
		
	}
}
