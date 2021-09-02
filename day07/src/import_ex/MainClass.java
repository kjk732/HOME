package import_ex;

import java.util.Scanner;

import com.abc.ABC;
import com.def.DEF;

import fruit.*; // 패키지 묶음


public class MainClass {

	public static void main(String[] args) {
		
		Apple a = new Apple();
		Melon m = new Melon();
		ABC abc = new ABC();
		DEF def = new DEF();
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println(a);
		System.out.println(m);
		System.out.println(def);
		System.out.println(abc);
		System.out.println(sc);
		
	}
	
	
}
