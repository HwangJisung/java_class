package ex2_vending;

public class Vending {
	private int money;
	private Can[] cans = new Can[5];
	
	// 자판기에 음료수를 종류별로 세팅
	public void init() {
		for(int i=0; i<cans.length; i++) {
			cans[i] = new Can();
		}
		
		cans[0].canName = "Fanta";
		cans[0].price = 1000;
		
		cans[1].canName = "Cider";
		cans[1].price = 1200;
		
		cans[2].canName = "Coke";
		cans[2].price = 1300;
		
		cans[3].canName = "Toreta";
		cans[3].price = 1500;
		
		cans[4].canName = "Pear";
		cans[4].price = 1800;
	}	
	
	// 사용자가 투입한 금액을 판단하여
	// 해당금액으로 먹을 수 있는 음료수의 목록만 보여주기
	public void showCans(int m) {
		money = m;
		
		for(int i=0; i<cans.length; i++) {
			if(cans[i].price <= money)
				System.out.printf("%s - %d원 사용 가능 \n", cans[i].canName ,cans[i].price );			
		}
	}
	
	// 선택한 음료를 제공하고 잔액을 반환하기 위한 메서드
	public void offer(String sel) {
		for(int i=0; i<cans.length; i++) {
			if(cans[i].canName.equals(sel))
				System.out.printf("%s - 잔액은 %d원 입니다 \n", cans[i].canName , money - cans[i].price );			
		}
	}
}
