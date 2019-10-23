package ex3_construct;

public class Monami {
	
	private int length;
	private String color;
	private int price;

	public Monami() {
		length = 15;
		color = "black";
		price = 500;
	}
	
	public Monami(int l, String c, int p) {
		length = l;
		price = p;
		color = c;
	}

	public Monami(String c, int p) {
		length = 10;
		price = p;
		color = c;
	}
	
	public void info() {
		System.out.println("가격 :" + price);
		System.out.println("색상 :" + color);
		System.out.println("길이 :" + length);
		System.out.println("-------------------");
	}
}
