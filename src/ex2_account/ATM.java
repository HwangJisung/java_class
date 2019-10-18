package ex2_account;

public class ATM {
	private int money = 0;
	
	// 입금
	public void deposit(int n) {

		money += n;		
		System.out.println(n + "원 입금하였습니다.");
		balance();
	}
	// 출금
	public void withdraw(int n) {

		if(n <= money) {
			money -= n;
			System.out.println(money + "원 출금하였습니다.");
		}
		else {
			System.out.println(money + "원 출금처리가 불가합니다.(출금 가능액 초과)");
		}
		balance();
		
	}
	// 잔액확인
	public void balance() {
		System.out.println("---------------------");
		System.out.println("잔액 : " + money + "원 입니다.");
		System.out.println("---------------------");
	}
}
