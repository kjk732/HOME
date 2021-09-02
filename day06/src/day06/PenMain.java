package day06;

public class PenMain {

	public static void main(String[] args) {
		
		//Pen의 기능을 사용하고 싶다면 객체로 생성해야합니다!
		Pen black = new Pen();
		
		black.ink = "검정";
		black.price = 2000;
		black.company = "모나미^^";
		
		black.write();
		black.info();
		
		Pen red = new Pen();
		
		red.ink = "빨강";
		red.price = 3000;
		red.company = "하잉테크!";
		
		red.write();
		red.info();
		
		
		
		
	}
}
