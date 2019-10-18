package ex1_updown;

import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Check ck = new Check();
		
		while (true) {
			System.out.print("정답이라는 값을 입력하세요. :");
			int sel = sc.nextInt();
			
			if(ck.setCheck( sel ))
				break;
		}
	}
}
