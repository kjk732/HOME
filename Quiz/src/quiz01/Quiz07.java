package quiz01;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("구입할 메뉴는?");
		System.out.println("[수박,사과,멜론,포도,귤]");
		System.out.print(">");
		String menu = scan.next();
		
		switch (menu) {
		case "수박":
			System.out.println("수박은 2만원");
			break;
		case "사과":
			System.out.println("사과는 3만원");
			break;
		case "멜론":
			System.out.println("멜론은 4만원");
			break;
		case "포도":
			System.out.println("포도는 5만원");
			break;
		case "귤":
			System.out.println("귤은 6만원");
			break;
		default:
			System.out.println(menu + "는 없습니다");
			break;
		}
		
		
	}
}
