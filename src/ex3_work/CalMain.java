package ex3_work;

import java.util.Scanner;

public class CalMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수1 : ");
		int su1 = sc.nextInt();
		
		System.out.println("수2 : ");
		int su2 = sc.nextInt();
	
		System.out.println("연산자 : ");
		String op = sc.next();
		
		Cal c = new Cal();
		c.getResult(su1, su2, op);
	}
}
