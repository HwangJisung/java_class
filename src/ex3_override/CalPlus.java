package ex3_override;

public class CalPlus extends Calculator{
	@Override
	public void getResult(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.printf("%d + %d = %d\n",n1 , n2 , n1+n2);
	}
}
