package ex2_vending;

import java.util.Scanner;

public class VendingMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		Vending vd = new Vending();
		vd.init();

		System.out.print("자판기에 돈을 입력하세요 : ");
		int m = sc.nextInt();
		
		vd.showCans(m);
		
		System.out.print("음료 선택 : ");
		String sel = sc.next();
		
		vd.offer(sel);
		
		
	}
}
