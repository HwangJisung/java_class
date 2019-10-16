package ex2_work;

public class TimesTable {
	public void showTable(int dan) {
		// 사용자가 입력한 값에 해당하는 구구단을 출력
		for(int i=1; i<=9; i++)
		{
			int result = dan * i;
			System.out.printf("%d * %d = %d\n",dan , i, result);
		}
	}
}
