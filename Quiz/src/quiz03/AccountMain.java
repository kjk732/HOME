package quiz03;

public class AccountMain {

	public static void main(String[] args) {
		
		Account acc = new Account("홍길동", "1234", 1000);
		
		acc.deposit(500); //+500
		acc.withDraw(1000); //-1000
		
		int bal = acc.getBalance();
		System.out.println(acc.name  + "님의 잔액:" + bal);
		
		
	}
}
