package day06;

public class VarMain {

	public static void main(String[] args) {
		
		Variable var = new Variable();
		
		System.out.println(var.a); //0
		var.a = 100; //변경
		
		var.printNumber(10);
	}
}
