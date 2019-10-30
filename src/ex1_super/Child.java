package ex1_super;

public class Child extends Parent{
	
	int number = super.number;

	public Child() {
		super(20, "홍길동");
		System.out.println("자식 클래스의 생성자");
	}
	
	@Override
	public void getEye() {		
		super.getEye();
	}
}
