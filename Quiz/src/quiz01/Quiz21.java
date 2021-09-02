package quiz01;

import java.util.Arrays;

public class Quiz21 {

	public static void main(String[] args) {
		
		//버블정렬-
		int[] arr = {5, 23, 1, 43, 100, 200, 40}; 
		//5, 1, 23, 43, 100, 40, 200 //6 - 6
		//1, 5, 23, 43, 40, 100, 200 //5 - 5
		//1, 5, 23, 40, 43, 100, 200 //4 - 4
		//1, 5, 23, 40, 43, 100, 200 //3 - 3
		//1, 5, 23, 40, 43, 100, 200 //2 - 2
		//1, 5, 23, 40, 43, 100, 200 //1 - 1
		
		for(int i = arr.length-1; i > 0; i--) {//6, 5, 4, 3, 2, 1 
			
			for(int j = 0; j < i; j++) {
				//System.out.println(i + "-" + j);
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}

			}
			System.out.println(Arrays.toString(arr));
		}
		
		
		
		
		
	}
}
