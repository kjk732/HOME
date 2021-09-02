package day04;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		
		//  

		Scanner sc= new Scanner(System.in);
		
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		int[] ageList = new int[100];
		boolean flagU = false;
		boolean flagD = false;
		
		int count = 0 ; //사람수
		int index = 0; //위치값
		
		ex : while(true) {
			
			System.out.println("[정보]사람수 :" + count +  ", 현재위치 :" + index);
			System.out.print("위치 정보(●가 선택된 위치): ");
			for(int z = 0 ; z < count ; z ++){
				if (z == index-1) {
					System.out.print("●");
				}else {
					System.out.print("○");
				}
			}
			System.out.println();
			System.out.println("[메뉴]1.Insert, 2.Prev, 3.Next, 4. Current, 5. Update, 6.Delete, 7.exit");
			System.out.print("메뉴입력>");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				// 이름, 성별(f/m), 나이를 받아서 각각 배열에 저장.
				// 사람수를 증가
				
				System.out.print("입력할 인원 수를 설정해주세요> ");
				int student = sc.nextInt();
				System.out.println("---------------------");
				
				for(int i = 0 ; i < student ; i++) {
				System.out.println("[이름, 성별(f/m), 나이]를 입력해주세요");
				System.out.print("이름> ");
				String name =sc.next();
				System.out.print("성별(f/m)> ");
				String gen =sc.next();
				System.out.print("나이> ");
				int age =sc.nextInt();
				
				nameList[i] = name;
				genderList[i] = gen;
				ageList[i] = age;
				count ++;
				
				
				}
				System.out.println("---------------------");
				
				System.out.print("보려는 학생번호(위치정보)를 선택해주세요>");
				index = sc.nextInt();
				if(index <= count)
					System.out.println(index + "번째 학생입니다.");
				else {
					System.out.println("학생번호는 최대 " + count+ "까지입니다.");
					index = 0;
				}
				System.out.println("---------------------");
				break;
			case 2:
				/*ex) index는 0이하로 내려갈 수 없기 때문에, 0이하면 "정보가 없습니다"
				 * 그렇지 않으면 index를 조정해서 이전정보를 출력해서 보여주면됩니다.
				 */
				
				if(index <= count+1 && index >= 2) {
					
					System.out.println("이전은 " + (index-1) + "번째 학생입니다.");
					System.out.println("이름:" + nameList[index-2] + ", 성별 : " + genderList[index-2] + ", 나이: " + ageList[index-2]);
					index--;
				}else {
					System.out.println("선택할 위치가 1보다 작을 수는 없습니다.");
				}
				System.out.println("---------------------");
				System.out.println();
				
				break;
			case 3:
				/* 다음 고객정보가 없는 조건을 생각해서 출력해 주세요(index와 count가 연관)
				 * 
				 */
				if(index < count ) {
					
					System.out.println("다음은 " + (index+1) + "번째 학생입니다.");
					System.out.println("이름:" + nameList[index] + ", 성별 : " + genderList[index] + ", 나이: " + ageList[index]);
					index++;
				}else {
					System.out.println(count + "이하의 숫자 까지 가능합니다.(" + count + "의 다음이 없음)");
				}
				System.out.println("---------------------");
				System.out.println();
				
				
				break;
			case 4:
				/* 
				 * 현재 고객정보를 출력할 수 없는 조건을 생각해서 정보를 출력해주세요.
				 * ex) 사람수 5명인데 index 5
				 */
				if(index <= count) {
					System.out.println("현재 선택한 학생은 " + index + "번째 학생입니다.");
					System.out.println("이름:" + nameList[index-1] + ", 성별 : " + genderList[index-1] + ", 나이: " + ageList[index-1]);
				}else {
					System.out.println("학생번호는 " + count + " 이하로 입력해 주셔야 합니다.");
				}
				System.out.println("---------------------");
				System.out.println();
				break;
			case 5:
				/*
				 * 4번과 조건은 동일합니다.
				 * 스캐너를 통해서 순서대로 이름, 성별, 나이를 입력받아서 현재 위치값을 수정하면 됩니다.
				 */
				if(index > 0 && index <=count) {
				System.out.println("새로 입력하실 [이름, 성별(f/m), 나이]를 입력해주세요");
				System.out.print("이름> ");
				String nName =sc.next();
				System.out.print("성별(f/m)> ");
				String nGen =sc.next();
				System.out.print("나이> ");
				int nAge =sc.nextInt();
				
				nameList[index-1] = nName;
				genderList[index-1] = nGen;
				ageList[index-1] = nAge;
				
				System.out.println(index + "번째 학생을 수정하였습니다.");
				}
				
				System.out.println("---------------------");
				flagU = true;
				System.out.println();
				break;
			case 6:
				/* 
				 * 4번과 조건은 동일합니다.
				 * 현재 위치에서 부터 사람수까지 배열요소를 당겨서 덮어 씌웁니다.
				 * 삭제할 데이터가 없으면 "없습니다"를 출력하면됩니다.
				 */
				
				System.out.println(index +"번째 학생의 정보를 삭제합니다");
				
				if(index  <= count ) {
				for(int j= index-1 ; j < count -1 ; j++) {
					
					nameList[j] = nameList[j+1];
					genderList[j] = genderList[j+1];
					ageList[j] = ageList[j+1];
					
				}
				count --;
				if(index-1 == count) {
					index--;
				}
				System.out.println("---------------------");
				flagD = true;
				}else {
					System.out.println("삭제할 정보가 없습니다.");
				}
				System.out.println();
				break;
			case 7:
				/*
				 * 루프의 탈출
				 */
				System.out.println("학생 정보 관리를 종료합니다.");
				System.out.println("---------------------");
				System.out.println();
				break ex; // System.exit(0);
			
			default:
				//잘못 입력된 경우
				System.out.println("메뉴에 있는 숫자를 선택해주세요.");
				System.out.println("---------------------");
				System.out.println();
				break;
			}
		
		}
		
		System.out.println("전체 결과 값");
		
		System.out.print("이름: [");
		for(int k = 0; k < count ; k++) {
			System.out.print(nameList[k]);
			if(k == count -1) break;
			System.out.print(", ");
		}
		System.out.print("]");
		System.out.println();
		
		System.out.print("성별: [");
		for(int o = 0; o < count ; o++) {
			System.out.print(genderList[o]);
			if(o == count -1) break;
			System.out.print(", ");
		}
		System.out.print("]");
		System.out.println();
		
		System.out.print("나이: [");
		for(int p = 0; p < count ; p++) {
			System.out.print(ageList[p]);
			if(p == count -1) break;
			System.out.print(", ");
		}
		System.out.println("]");
		
		System.out.println("자료 변경여부:" +(flagU == true ? "O" : "X"));
		System.out.println("자료 삭제여부:" +(flagD == true ? "O" : "X"));
		sc.close();
	}

}
