package ex1_super;

public class Parent {
	
	int number;
	
	public Parent(int age, String name) {
		System.out.println(age + "살 " + name + "이름을 가진 부모");
	}
	
	public void getEye() {
		System.out.println("눈 갯수가 궁금하군.....");
	}
}
