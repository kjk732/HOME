package quiz01;

import java.util.Scanner;

public class Quiz23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 투입하세요>");
		int money = scan.nextInt();
		
		
		ex:while(true) {
			System.out.println("남은금액:" + money + "원");
			System.out.println("[1]데미소다:400원, [2]밀키스:500원, [3]코가골라:600원, [4]잔돈받기");
			System.out.print(">");
			int menu = scan.nextInt();
			
			//boolean flag = false; //탈출을 위한 변수
			
			switch (menu) {
			case 1:
				
				if(money >= 400) {
					System.out.println("데미소다를 받았어용");
					money -= 400;
				} else {
					System.out.println("금액이 부족합니다");
				}
				break;
			case 2:
				if(money >= 500) {
					System.out.println("밀키스를 받았어용");
					money -= 500;
				} else {
					System.out.println("금액이 부족합니다");
				}
				break;
			case 3:
				if(money >= 600) {
					System.out.println("코카콜라를 받았어용");
					money -= 600;
				} else {
					System.out.println("금액이 부족합니다");
				}
				break;
			case 4:
				System.out.println("남은금액:" + money + "를 반환합니다.");
				//flag = true;
				
				break ex;
			default:
				System.out.println("잘못 입력 했습니다");
				System.out.println("메뉴를 정확히 입력하세요");
				break;
			}

			//if(flag) break; //true라면 탈출
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
