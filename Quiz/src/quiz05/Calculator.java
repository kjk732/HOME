package quiz05;

public class Calculator {

	int result;
	double pi = 3.14;
	
	int add(int n) {
		result += n;
		return result;
	}
	
	int sub(int n) {
		result -= n;
		return result;
	}
	
	double circle(int r) {
		return r * r * pi;
	}
	
	
	
	
}
