package ex1_overload;

public class BreadMain {
	public static void main(String[] args) {
		Bread br = new Bread();
		
		br.makeBread();
		System.out.println("-----------------");
		
		br.makeBread(3);
		System.out.println("-----------------");
		
		br.makeBread("크림", 3);
	}
}
