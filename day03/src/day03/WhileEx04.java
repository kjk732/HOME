package day03;

import java.util.Arrays;

public class WhileEx04 {

	public static void main(String[] args) {
		
		//배열과 반복문
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr) );
		
		int i = 0; //시작값
		int sum = 0;
		while(i < arr.length) {
			
			//System.out.println( arr[i]);
			sum += arr[i];
			
			i++;
		}
		
		System.out.println("배열요소의합:" + sum);
		
		
		
		
	}
}
