package quiz01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키와 나이를 입력하세요");
		System.out.print("키>");
		double cm = scan.nextDouble();
		
		System.out.print("나이>");
		int age = scan.nextInt();
		
		if(cm >= 140 && age >= 8) {
			System.out.println("놀이기구 사용이 가능합니다");
		} else {
			System.out.println("놀이기구 사용이 불가능합니다");
		}
		
		scan.close();
		
		
	}
}
