package encap.bad;

public class MainClass {
	
	public static void main(String[] args) {
	
//		멤버변수가 public이라면 잘못된 값이 저장될 수도 있다는 뜻입니다.
		MyDate me = new MyDate();
		me.year = 2021;
		me.month= 12;
		me.day = 100;
		me.ssn = "이게뭔데요?";
		
		me.info();
}
}
