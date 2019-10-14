package ex1_computer;

public class ComClass {
	// 컴퓨터의 대량생산을 위한 설계도
	// 컴퓨터의 속성들은 뭐가 있는지 생각해보자.
	
	int hdd = 500;
	int ram = 16;
	float cpu = 2.5f;
	String color = "white";
	
	// 컴퓨터의 정보를 출력할 메서드
	// 메서드란 어떠한 작업을 수행하기 위한 명령문의 집합!!
	// 메서드를 사용하는 가장 큰 이유는 반복적으로 사용되는 코드를 줄이기 위함.
	public void getInfo() {
		System.out.println("hdd :"+ hdd);
		System.out.println("ram :"+ ram);
		System.out.println("cpu :"+ cpu);
		System.out.println("color :"+ color);
		System.out.println("=========");
	}
	
	// 메서드의 구성!!
	// 접근제한자   반환형   메서드명(첫글자는 소문자로) 메서드 안에 소괄호 안에 들어가는 값을 파라미터 또는 인자라고 부름  중괄호 안에 메서드의 실행영역
	// public   void  getInfo() { }
	
	// 접근제한자의 종류
	// 1. public  : 같은 프로젝트 내의 모든 객체들에게 사용을 허가
	// 2. private : 현재 클래스에서만 사용을 허가
	// 3. protected : 상속관계의 객체들에게만 사용을 허가
	// 4. default : 같은 패키지 내의 모든 객체들에게 사용을 허가
	
}
