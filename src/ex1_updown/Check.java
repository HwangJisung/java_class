package ex1_updown;

import java.util.Random;

public class Check {
	private int random = new Random().nextInt(50)+1;
	private int cnt = 1;
	private boolean isEnd = false;
	
	public boolean setCheck(int sel) {
		
		if(sel > random)
		{
			System.out.println("down!!! " + cnt + "회 재도전");
		}
		else if (sel < random)
		{
			System.out.println("up!!! " + cnt + "회 재도전");
		}
		else
		{
			System.out.println("Bingo!!! " + cnt + "회 만에 맞추셨습니다.");
			isEnd = true;
		}

		cnt++;
		return isEnd;
	}
	
	
}
