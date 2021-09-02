package day04;


import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {
		
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		//4번째 인덱스의 삭제를 표현
//		for(int i =4 ; i < arr.length - 1; i++)
//		{
//			arr[i] = arr[ i+1 ];
//			
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
		
		//별명 입력 -> 탐색 -> 당겨오기
		Scanner sc = new Scanner(System.in);
		String[] arr = { "강타", "문희준", "이재원", "장우혁", "토니안"};
		
		System.out.print("삭제할 별명을 입력하세요>");
		String name = sc.next();
		
		int count = arr.length; // 사람수 (변수화)
		boolean flag = false; //삭제여부 
		
		for ( int i = 0 ; i < count ; i++) {
			
			if(name.equals(arr[i])) {
				System.out.println(name + "을 삭제합니다.");
				
				//뒤에 인덱스를 하나씩 당겨오기
				for(int j = i ; j < count -1 ; j++) {
					arr[j] = arr[j+1];
					
				}
				//삭제의 의미
				count--;
				flag = true;
				
			}
		}
		
		if(flag) {
			
			System.out.println("======삭제 후 정보 ======");
			for(int i = 0; i < count ; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.print("\n======================");
		}else {
			System.out.println("삭제 할 별명이 없습니다.");
			
		}
		sc.close();
		
	}
	
}
