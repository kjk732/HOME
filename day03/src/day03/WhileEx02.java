package day03;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("약수를 개수를 확인할 정수 입력>");
		int num = scan.nextInt();
		
		int a = 1;
		int count = 0; //약수의 개수를 누적할 변수
		
		while(a <= num) {
			
			if(num % a == 0) { //a : 1,2,3,4,5,6.....num
				count++;
			}
			
			a++;
		}
		
		System.out.println(num +"의 약수의 개수:" + count);
		
		
		
	}
}
