package ex1_extends;

public class Exmain {
	public static void main(String[] args) {
		// 부모를 상속받은 자식클래스는 부모로부터
		// 부모가 가지고 있는 속성들을 마음대로 가져다가 사용할 수 있다.
		Child c1 = new Child();
		System.out.println(c1.car);
		System.out.println(c1.str);
		System.out.println(c1.money);
		
		Child c2 = new Child();
		System.out.println(c2.car);
		System.out.println(c2.str);
		System.out.println(c2.money);
		
		// 부모는 상속관계라고 할지라도 자식이 가진 속성을 가져다 사용할 수 없다.
		Parent p1 = new Parent();
		System.out.println(p1.money);
	}
}
