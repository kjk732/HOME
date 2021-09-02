package day03;

public class WhileEx03 {

	public static void main(String[] args) {
		
		//반복문으로 소수여부 판별.
		
		int num = (int)(Math.random() * 101);
				
		int i = 2;
		while(num % i != 0) { //나머지가 0이 아니면 (즉 약수가 아니면 2~num까지 증가)
			
			i++;
		}
		
		System.out.println(num == i ? num + "은 소수" : num + "은 소수가 아닙니다");
		
		
		
		
		
		
		
	}
}
