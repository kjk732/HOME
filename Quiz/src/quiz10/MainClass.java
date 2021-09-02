package quiz10;

public class MainClass {

	public static void main(String[] args) {
		
		Computer C = new Computer();
		
		C.computerInfo();
		
		Monitor m = C.getMonitor();
		m.info();
		Mouse M = C.getMouse();
		M.info();
	}
}
