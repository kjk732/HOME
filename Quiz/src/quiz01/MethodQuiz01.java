package quiz01;

import java.sql.Connection;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

import javax.activation.DataSource;

public class MethodQuiz01 {

	public static void main(String[] args) {
		

		method5("가", 5);
		int result =  maxNum(5, 3);
		int reuslt2 = abs(-1);
		System.out.println();
		
		char[] cArr = {'a', 'p', 'p', 'l', 'e' };
		String result3 = method06(cArr);
		System.out.println(result3);
		
		int[] iArr = {1,2,3,4,5};
		int result4 = method07(iArr);
		System.out.println(result4);
		
		
		String[] sArr = method08("a", "b");
		System.out.println(Arrays.toString(sArr));
	}
	
	static void method5(String a, int b) {
		
		for(int i = 1; i <= b; i++) {
			System.out.print(a);
		}
		
	}
	static int maxNum(int a, int b) {

		return a == b ? 0 : (a > b ? a : b);
	}
	static int abs(int a) {
		return a > 0 ? a : -a;
	}
	
	static String method06(char[] arr) {
		String s = "";
		for(char c : arr ) {
			s += c;
		}
		return s;
	}
	static int method07(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	static String[] method08(String a, String b) {
		String[] sArr = {a, b};
		return sArr;
	}
	
	
	
	
}
