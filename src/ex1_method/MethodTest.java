package ex1_method;

public class MethodTest {
	public void test() {
		System.out.println("안녕하세요.");
		System.out.println("반갑습니다.");
	}
	
	public int value(int n) {
		n++;
		System.out.println("n값은 "+ n + "입니다");
		
		// 반환형이 존재하는 경우 return 코드가 필수적으로 필요
		// return은 특정 값을 가지고 나를 호출했던 곳으로 복귀한다.
		// 반환형과  return값은 반드시 동일한 타입이어야 한다.
		
		return 0;
	}
	
	public int value2(int num) {
		if(num==0) {
			System.out.println("0으로는 나눌수 없습니다.");
			System.out.println("1로 변환합니다.");
			num = 1;
		}
		
		return num;
	}
	
	public String testAlba(String name , int age) {
		
		if(age > 20) {
			return name + "님 합격입니다.";
		}
		else {
			return name + "님 불합격입니다.";
		}
	}
}
