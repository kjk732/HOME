package day03;

public class ForEx01 {

	public static void main(String[] args) {
		
		//1~10합
		int sum = 0;		
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합계:" + sum);
		
		System.out.println("---------------------------------------");

		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		
	}
}
