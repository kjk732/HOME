package arr;

import java.util.Scanner;

public class Arr03ABC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int cal = A * B * C;
		int N = 0;
		int count9 = 0, count8 = 0, count7 = 0 , count6 = 0  , count5 = 0 , count4 = 0 , count3 = 0, count2 = 0, count1 = 0, count0 = 0 ;
		
		for ( int i = 1 ; i <= 9 ; i ++) {
			
			N = cal % 10;
			int nextCal = cal / 10;
			
			if (cal / 10 == 0) {
				int a = cal %10;
				switch (a) {
				case 9:
					
					count9 ++;
					break;
				case 8:
					count8 ++;
					break;
				case 7:
					count7 ++;
					break;
				case 6:
					count6 ++;
					break;
				case 5:
					count5 ++;
					break;
				case 4:
					count4 ++;
					break;
				case 3:
					count3 ++;
					break;
				case 2:
					count2 ++;
					break;
				case 1:
					count1 ++;
					break;
				case 0:
					count0 ++;
					break;
				default:
					break;
				}
				break ;
			}
			else {
				
				cal = nextCal;
			
			switch (N) {
			case 9:
				
				count9 ++;
				break;
			case 8:
				count8 ++;
				break;
			case 7:
				count7 ++;
				break;
			case 6:
				count6 ++;
				break;
			case 5:
				count5 ++;
				break;
			case 4:
				count4 ++;
				break;
			case 3:
				count3 ++;
				break;
			case 2:
				count2 ++;
				break;
			case 1:
				count1 ++;
				break;
			case 0:
				count0 ++;
				break;
			default:
				break;
			}
		}
			
			
		}
		System.out.println(count0);
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		System.out.println(count5);
		System.out.println(count6);
		System.out.println(count7);
		System.out.println(count8);
		System.out.println(count9);
	}
}
