package day06;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone black = new Phone();
		
		black.info();
		
		Phone iPhone = new Phone("아이폰");
		iPhone.info();
		
		Phone galaxy = new Phone("갤럭시 노트7", 600000);
		galaxy.info();
		
		// 모든 멤버변수를 받는 생성자를 만들고
		// 초록색, 100000원, 가로본능으로 객체를 생성
		Phone myPhone = new Phone("초록색", 100000 , "가로본능");
		myPhone.info();
	}
}
