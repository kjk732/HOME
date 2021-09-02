package day06;

public class Phone {

	
	String model;
	int price;
	String color;
	
	// 생성자는 클래스이름과 동일합니다. 반환 유형이 없다.
	Phone(){
		System.out.println("생성자 호오오출!");
		model = "햅틱";
		price = 20000;
		color = "black";
	
	}
	
	
	//생성자는 여러개 선언 할 수 있습니다.
	//단, 매개변수 종류 or 개수를 다르게 해야합니다.
	Phone(String pModel){
		model = pModel;
		price = 30000;
		color = "red";
	}
	
	Phone(String pModel, int pPrice){
		model = pModel;
		price = pPrice;
		color = "white";
	}
	
	Phone(String pColor, int pPrice, String pModel){
		color = pColor;
		price = pPrice;
		model = pModel;
	}
	void info() {
		System.out.println("=== 휴대폰 정보 ===");
		System.out.println("모델: " + model);
		System.out.println("가격: " + price);
		System.out.println("색상: " + color);
	}
}
