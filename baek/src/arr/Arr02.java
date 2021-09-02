package arr;

import java.util.Arrays;
import java.util.Scanner;

public class Arr02 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		int[] arr = new int[9];
	
		for(int  i = 0 ; i < 9 ; i++) {
			int t = sc.nextInt();
			arr[i] = t;
			}
			
		System.out.println(Arrays.toString(arr));
		ex :for(int j = 0 ; j <= 8  ; j++ ) {
			
			int maxCount = 0;
			
			for(int k = 0 ; k <= 8 ; k++ ) {
				
				if ( arr[j] > arr[k])  // 같은 수인 경우는 제외
					maxCount++;
			
				if (maxCount == 8) {
					System.out.println(arr[j]);
					System.out.println(j+1);
					break ex;
				}
			
			}	
		
		}
	}
	

}
