package ex2_work;

import java.util.Scanner;

public class TimesMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단 :");
		int dan = sc.nextInt();
		
		TimesTable tt = new TimesTable();
		tt.showTable(dan);
	}
}
