package baek;

import java.util.Scanner;

public class level1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c1 = b / 100;
		int c3 = b % 10;
		int c2 = ((b % 100) -c3) / 10;
		
		System.out.println(a * c3);
		System.out.println(a * c2);
		System.out.println(a * c1);
		System.out.println(a * b);
		sc.close();
	 }
	}

