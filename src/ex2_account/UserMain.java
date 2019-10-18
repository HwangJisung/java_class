package ex2_account;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Scanner sc = new Scanner(System.in);
		int money = 0;
		
		out : while ( true ) {
			System.out.println("1. 입  금 : ");
			System.out.println("2. 출  금 : ");
			System.out.println("3. 잔  액 : ");
			System.out.println("Etc.종료 : ");
			System.out.print(">>>>");
			
			int select = sc.nextInt();
			
			switch (select) {
			case 1: // 입금
				System.out.println("---입금---");
				System.out.println("입금액 : ");
				money = sc.nextInt();
				
				atm.deposit(money);
				break;
				
			case 2: // 출금
				System.out.println("---출금---");
				System.out.println("출금액 : ");
				money = sc.nextInt();
				
				atm.withdraw(money);
				break;

			case 3: // 잔액
				System.out.println("---잔액---");
				atm.balance();
				break;
				
			default:
				System.out.println("종료합니다.");
				break out;
			}
		}
	}
}
