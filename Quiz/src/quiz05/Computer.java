package quiz05;

public class Computer extends Calculator {
	//오버라이딩
	double circle(int r) {
		return r * r * Math.PI;
	}
	
	double rect(double a) {
		return a * a;
	}
	
	double rect(double a, double b) {
		return a * b;
	}
	
	double rect(double a, double b, double c) {
		return a * b * c;
	}
	
	
}
