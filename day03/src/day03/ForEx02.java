package day03;

public class ForEx02 {

	public static void main(String[] args) {
		
		//for문을 이용해서 소수의 판별 . (소수는 약수의 개수 2개)
		int num = (int)(Math.random() * 100);
		
		int count = 0;
		for(int i = 1; i <= num; i++) {
			
			if(num % i == 0) { //약수
				count++;
			}
		}
		
		System.out.println(count == 2 ? num + "은 소수" : num + "은 소수가 아닙니다");
		
		
		
		
	}
}
