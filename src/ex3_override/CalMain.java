package ex3_override;

public class CalMain {
	public static void main(String[] args) {
		CalPlus cp = new CalPlus();		
		cp.getResult(10, 5);
		
		CalMinus cm = new CalMinus();
		cm.getResult(10, 5);
	}
}
