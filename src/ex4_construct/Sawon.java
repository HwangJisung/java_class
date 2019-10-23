package ex4_construct;

public class Sawon {
	private String name;
	private int age;
	private String major;
	
	public Sawon(String n, int a, String m) {
		name = n;
		age = a;
		major = m;
	}
	
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전공 : " + major);
		System.out.println("--------------");
	}
}
