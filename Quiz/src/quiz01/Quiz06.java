package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		/*
		 * 정수를 3개 순서대로 입력받습니다.
		 * 가장큰값, 중간값, 가장 작은값을 구해서 max, mid, min변수에 저장하고 출력하면됩니다.
		 * 
		 * 단 값이 같은 경우에는 없다고 가정한다.
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">");
		int num1 = scan.nextInt();
		System.out.print(">");
		int num2 = scan.nextInt();
		System.out.print(">");
		int num3 = scan.nextInt();

		int max = 0, mid = 0, min = 0;
		
		
		
		
		
		if(num1 > num2 && num1 > num3) { //num1이 가장 큰 경우
			
			max = num1; //가장 큰 값
			
			if(num2 > num3) { //num2가 중간값
				mid = num2;
				min = num3;
			} else { //num3이 중간값
				mid = num3;
				min = num2;
			}
						
		} else if(num2 > num1 && num2 > num3) { //num2가 가장 큰 경우
			
			max = num2;
			
			if(num1 > num3) {
				mid = num1;
				min = num3;
			} else {
				mid = num3;
				min = num1;
			}
		} else { //num3이 가장 큰 경우
			max = num3;
			
			if(num2 > num1) {
				mid = num2;
				min = num1;
				
			} else {
				mid = num1;
				min = num2;
			}
		}
		 
		System.out.println("max:" + max + ", mid:" + mid + ", min:" + min);
		
		
		
		
		
		
		
		
	}
}
