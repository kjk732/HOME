package day03;

public class SwitchEx01 {

	public static void main(String[] args) {
		
		int a = 1;
		
		//정수나, 문자, 문자열이 switch의 소괄호에 들어갑니다.
		switch(a) {
		
		case 0:
		case 1:
			System.out.println("1입니다");
			break; //switch문을 즉시 빠져나옵니다
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		default :
			System.out.println("1,2,3이 아닙니다");
			break;
		}
		
		
		
		
		
		
	}
}
