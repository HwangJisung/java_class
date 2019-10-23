package ex3_construct;

public class MonamiMain {
	public static void main(String[] args) {
		Monami m1 = new Monami();
		m1.info();
		
		Monami m2 = new Monami();
		m2.info();
		
		Monami m3 = new Monami(10, "red", 500 );
		m3.info();

		Monami m4 = new Monami("gold", 20000 );
		m3.info();
		
	}
}
