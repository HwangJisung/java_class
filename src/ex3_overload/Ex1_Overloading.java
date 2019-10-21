package ex3_overload;

public class Ex1_Overloading {
	// 오버로딩은 메서드의 '중복정의'라고 한다.
	// 하나의 클래스 내에서 같은 이름을 가진 메서드가 여러개 만들어져 있는 것을 의미
	// 오버로딩의 규칙
	// ** 메서드들의 이름은 대소문자를 비롯하여 반드시 같아야 합니다.
	// 1. 파라미터의 수가 다른 경우 
	// 2. 파라미터의 수가 같다면 타입을 다르게 하면 가능
	// 3. 파라미터 수가 같아도 순서가 다르면 가능
	
	
	public void result() {
		System.out.println("인자가 없는 메소드 입니다.");
	}
	public void result(int n) {
		System.out.println("정수를 인자로 받는 메소드 입니다.");
	}
	public void result(String str) {
		System.out.println("스트링을 인자로 받는 메소드 입니다.");
	}
	public void result(String str , int n) {
		System.out.println("스트링과 정수를 인자로 받는 메소드 입니다.");
	}
	public void result( int n , String str) {
		System.out.println("정수와 스트링을 인자로 받는 메소드 입니다.");
	}
}
