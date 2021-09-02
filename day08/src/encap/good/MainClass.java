package encap.good;

public class MainClass {

	public static void main(String[] args) {
		
		MyDate me = new MyDate();
//		me.year = 2021;
		
		me.setYear(2022); // 잘못된 값
		me.setYear(1995);
		System.out.println("년도: " + me.getYear());
		
		me.setMonth(13); // 잘못된 값
		me.setMonth(8);
		System.out.println("월 : " + me.getMonth());
		
		me.setDay(32); //잘못된 값
		me.setDay(10);
		System.out.println("날짜: " + me.getDay());
		
		me.setSsn("456481237897867154"); // 잘못된 값
		me.setSsn("1234567890123");
		System.out.println("주민번호: " + me.getSsn());
	}
	
	
}
