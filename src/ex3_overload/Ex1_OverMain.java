package ex3_overload;

public class Ex1_OverMain {
	public static void main(String[] args) {
		Ex1_Overloading ol = new Ex1_Overloading();
		
		
		ol.result();
		ol.result(0);
		ol.result("1",0);
		ol.result(0,"1");
		
	}
}
