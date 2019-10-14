package ex2_chicken;

public class Chicken {

	String type = "후라이드";
	String born = "순살";
	int price = 14000;
	
	//정보출력을 위한 메서드
	void outChicken() {
		System.out.println(type + " 치킨을 주문해 주셔서 감사합니다!");
		System.out.println(born + " 치킨입니다");
		System.out.println("가격은 "+ price + "원 입니다.");
		System.out.println("---------------------------");
	}
}
