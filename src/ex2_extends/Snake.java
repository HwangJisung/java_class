package ex2_extends;

public class Snake extends Animal{
	String sensor = "감각이좋아요.";
	
	// 오버라이딩 : 메서드의 재정의
	// 상속관계의 객체에서 부모의 메서드를 자식이 가져와서 쓰되,
	// 자식에 사정에 맞도록 내용만 재정의 하는 것
	@Override
	public int getLeg() {
		return 0;
	}
}
