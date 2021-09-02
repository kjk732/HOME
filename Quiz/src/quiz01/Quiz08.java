package quiz01;

public class Quiz08 {

	public static void main(String[] args) {
		
		String[] arr = {"안녕하세요", "hi", "니취팔로마", "#$%"};
		
		/*
		 * Math.random()을 이용해서 0~3까지 랜덤수를 발생시키고,
		 * 해당 인덱스를 배열에 적용해서, 선택된 값이 한국어, 영어, 중국어, 외계어 인지 구별하면 됩니다.
		 */
		
		int index = (int)(Math.random() * arr.length);
		System.out.println("선택된단어:" + arr[index]);
		
		switch ( index ) {
		
		case 0:
			System.out.println("한국어입니다");
			break;
		case 1:
			System.out.println("영어입니다");
			break;
		case 2:
			System.out.println("중국어입니다");
			break;
		default:
			System.out.println("이상한 언어인데요?");
			break;
		}
		
		
	}
}
