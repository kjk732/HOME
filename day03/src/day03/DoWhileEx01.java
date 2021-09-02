package day03;

public class DoWhileEx01 {

	public static void main(String[] args) {
	
//		int i = 1;
//		int sum = 0;
//		while(i <= 10) {
//			sum += i;
//			i++;
//		}
		
		System.out.println("-------------------------------");
		
		//do~while문은 조건검사가 마지막에 일어나기 때문에 한번은 무조건 실행되는 특징이 있습니다.
		int i = 1;
		int sum = 0;
		
		do {
			
			sum += i;
			i++;
		} while (i <= 10);
		
		
		System.out.println("합:" + sum);
		
		
		
		
		
		
	}
}
