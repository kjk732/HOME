package day03;

public class MultiForEx01 {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 1; j <= 9; j++) {
//				System.out.println(i +"-" + j);
//			}
//			
//		}
		
		//단수
		for(int i = 2; i <= 9; i++) {
			
			System.out.println("구구단" + i + "단");
			
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i*j );
			}
			
			System.out.println("--------------");
		}
		
		
		
		//바깥 반복문에 회전수에 따라 안쪽 반복문의 회전이 변경되는 형태
		for(int i = 1; i <= 9; i++) {
		
			for(int j = 1; j <= i; j++) {
				System.out.println(i + "-" + j);				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
