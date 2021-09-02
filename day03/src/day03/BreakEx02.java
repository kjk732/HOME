package day03;

public class BreakEx02 {

	public static void main(String[] args) {
		
		ex:for(char c = 'A'; c <= 'Z'; c++) {
			
			for(char l = 'a'; l <= 'z'; l++) {
				System.out.println(c + "-" + l);
				
				if(l == 'f') break ex;
			}
		}
		
		
		
		
	}
}
