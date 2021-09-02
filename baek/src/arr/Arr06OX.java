package arr;

import java.util.Scanner;

public class Arr06OX {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
				
		String OX;
		
		for (int a = 0 ; a < testcase ; a ++) {
			
			OX = sc.next();
			int sum = 0 , cnt = 0;
			
			for (int j = 0 ; j < OX.length(); j++){
				
				if (OX.charAt(j)=='O'){
					cnt++;
					sum += cnt;
				}else {
					cnt=0;
				}	
			}System.out.println(sum);	
		}
		
		
	}
}
