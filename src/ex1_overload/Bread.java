package ex1_overload;

public class Bread {
	public void makeBread() {
		System.out.println("빵을 만들었습니다.");
	}
	public void makeBread(int n) {
		for(int i=0; i<n; i++) {
			System.out.println("빵을 " + i + "개 만들었습니다.");
		}
	}
	public void makeBread(String name, int n) {
		for(int i=0; i<n; i++) {
			System.out.println(name + "빵을 " + i + "개 만들었습니다.");
		}
	}
}
