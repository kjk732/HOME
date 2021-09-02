package quiz03;

public class Student {

	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String n, int n2, int k, int e, int m) {
		name = n;
		no = n2;
		kor = k;
		eng = e;
		math = m;
	}
	
	double getTotal() {
		return kor + eng + math;
	}
	
	double getAvg() {
		
		double avg = (int)(getTotal() / 3 * 100) / 100.0; 
		return avg;
	}
	
	
	
}
