package ex5_static;

public class Bank {
	private String point;
	private String tel;
	// 객체가 몇개가 생성되든 반드시 한개만 만들어 지는 변수나 메서드 -> static
	static float interest;
	
	public Bank(String p, String t) {
		// TODO Auto-generated constructor stub
		point = p;
		tel = t;
	}
	
	public void bankInfo() {
		System.out.println("지점 : " + point);
		System.out.println("전화번호 : " + tel);
		System.out.println("이자율 : " + interest + "%");
		System.out.println("----------------------");
		
	}
}
