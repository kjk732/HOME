package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUpdate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = { "강타", "문희준", "토니안", "장우혁", "이재원"};
		//배열의 변경
		//입력 -> 있는지 없는지 탐색 -> 변경
		
		System.out.print("수정할 별명을 입력하세요>");
		String name = sc.next();
		
		
		boolean flag = false;
		for(int i = 0; i< arr.length; i++) {
			
			if(name.equals(arr[i])) {//수정할 학생이 있는경우
				
				System.out.print("변경할 이름을 작성하세요> ");
				arr[i] = sc.next();
				flag = true; // if문을 실행했다는 증거.
				
			}
			
		}
		
		// 결과
		if(flag) {
			System.out.println("이름이 정상 수정되었습니다.");
			System.out.println(Arrays.toString(arr));
		}else {
			System.out.println("찾는 이름은 없습니다!");
		}
		sc.close();
	}
	
}
