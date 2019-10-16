package ex3_work;

public class Cal {
	public void getResult(int su1, int su2, String op) {
		if(op.equals("*"))
			System.out.printf("%d %s %d = %d",su1,op,su2, su1*su2);
		else if(op.equals("/"))
			System.out.printf("%d %s %d = %d",su1,op,su2, su1/su2);
		else if(op.equals("+"))
			System.out.printf("%d %s %d = %d",su1,op,su2, su1+su2);
		else if(op.equals("-"))
			System.out.printf("%d %s %d = %d",su1,op,su2, su1-su2);
		else
			System.out.println("연산이 되지 않는 연산자를 입력하셨습니다.");
		
	}
}
