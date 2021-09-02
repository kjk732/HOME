package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
//		문제	
//		1. 양수를 입력 받아, 입력 받은 수 크기의 배열을 생성하세요.
//		2. 배열에 1~입력 받은 수 까지 차례대로 값을 넣으세요
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.print("수를 입력하세요>");
//		int size = scan.nextInt();
//		int[] arr = new int[size]; //배열생성
//		
//		int i = 0;
//		while(i < arr.length) {
//			arr[i] = i+1;
//			i++;
//		}
//		System.out.println(Arrays.toString(arr));

		
//		문제 
		int[] arr = {1000, 500, 100, 50, 10}; //동전
		int money = 17520; //금액
	
		int i = 0;
		while(i < arr.length) {
			
			System.out.println(arr[i] + "원:" + money / arr[i]);
			money %= arr[i]; //money = money % arr[i]
			
			i++;
		}
		
		
		
		
		
	}
}
