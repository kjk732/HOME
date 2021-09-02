package quiz03;

public class Account {
//	1. 멤버 변수- 예금주이름(name : String), 비밀번호(password : String), 잔액(balance: int) 로 선언하세요.
//	2. 생성자 - 3가지 멤버 변수를 모두 매개값으로 받아 초기화하는 생성자를 선언하세요.
//	3. 메서드 - 입금기능 메서드(deposit : void), 출금기능 메서드(withDrwa: void), 잔액 조회 메서드(getbalance: int)
//	4. 아래와 같이 실행 될 수 있도록 클래스를 만드세요.
	
	String name;
	String password;
	int balance;
	
	Account(String n, String pw, int bal) {
		name = n;
		password = pw;
		balance = bal;
	}
	
	void deposit(int money) {
		balance += money;
	}
	
	void withDraw(int money) {
		balance -= money;
	}
	
	int getBalance() {
		return balance;
	}
	
	
}
