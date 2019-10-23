package ex2_construct;

public class Ex1_con {
	
	private int age;
	
	// 생성자
	// 1. 객체가 생성될 때 메모리 할당을 위해 딱 한번 호출된다
	// 2. 멤버변수의 초기화를 위해 사용되기도 한다.
	public Ex1_con() {
		age = 30;
		System.out.println("생성자가 호출하였습니다" + age + " 살 입니다.");
	} // 생성자
	
}
