package str_ex;

public class MainClass {

	public static void main(String[] args) {
	
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		/* 
		 * 같은 클래스 내부에서 문자열을 저장하면, 동일한 문자일 경우는 같은 주소를 참조.
		 * 하지만, 직접 문자열 생성을 하거나 , 다른 클래스에서 넘어온 문자열은 다른주소를 가지게 됩니다.
		 * 그래서 문자열 동등 비교는 == 대신에 문자열 자체를 비교해주는 equals()메서드를 이용해서 
		 * 문자열 자체를 비교해야합니다.
		 */
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		if(str1.equals(str2)) {
			
		}
}
}
