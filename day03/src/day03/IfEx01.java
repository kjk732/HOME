package day03;

public class IfEx01 {

	public static void main(String[] args) {
		
		//0~100까지 랜덤정수
		int point = (int)(Math.random() * 101);
		System.out.println("점수:" + point);
		
		
		if( point >= 60 ) {
			System.out.println("60점 이상입니다");
			System.out.println("합격!");
		} else {
			System.out.println("60점 미만입니다");
			System.out.println("불합격!");
		}
			
		
		
		
		
		
		
		
		
	}
}