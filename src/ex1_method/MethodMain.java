package ex1_method;

import java.util.Scanner;

public class MethodMain {
	public static void main(String[] args) {
		MethodTest met  = new MethodTest();
		
		met.test();		
		System.out.println("--------------------");
		
		int su = 100;
		su = met.value(su);
		System.out.println("su : " + su);		
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("10으로 나누고 싶은 값을 입력하세요 : ");
		int num = sc.nextInt();
		
		int res = met.value2(num);
		System.out.println("10을 "+ res + "으로 나눈 결과 : " + 10/res);
		System.out.println("--------------------");
		
		String result = met.testAlba("홍길동",30);
		System.out.println(result);
	}
}
