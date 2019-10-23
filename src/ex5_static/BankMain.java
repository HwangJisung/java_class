package ex5_static;

public class BankMain {
	public static void main(String[] args) {
		Bank b1 = new Bank("강남", "02-111-1111");
		//static 변수는 클래스 이름을 통해서 바로 호출이 가능		
		Bank.interest = 0.2f;		
		b1.bankInfo();
		
		Bank b2 = new Bank("서대문구", "02-222-2222");
		b2.bankInfo();
		
		Bank b3 = new Bank("마포", "02-333-3333");
		b3.bankInfo();
	}
}
