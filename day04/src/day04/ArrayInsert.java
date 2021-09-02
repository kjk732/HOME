package day04;


import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[100];//크기가 100인 배열
		int count = 0; //음식의 개수

		System.out.println("먹고싶은 음식이 뭐에요?");
		System.out.println("입력만 한번 해보세요");
		
		while(true) {
			
			System.out.print(">");
			String menu = sc.nextLine(); // 공백도 포함해서 받습니다.
			
			if(menu.equals("그만") ) break; // 문자를 비교를할 때, .equals
			
			arr[count] = menu;
			count++;
			
		}
		
		//System.out.println(Arrays.toString(arr));(원하는 답이아님)
		System.out.println("입력 종료!!");
		System.out.print("먹고 싶은 음식: [");
		for(int i = 0; i < count ; i++) {
			System.out.print(arr[i]);
			if(i == count -1) break;
			System.out.print(", ");
		}
		System.out.print("]");
		sc.close();
	}

}
