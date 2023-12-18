package ch02시간복잡도;

import java.util.Scanner;

public class 개미 {

	public static void main(String[] args) {
		// 백준10158
		//시간복잡도 생각 해야함 
		// 1<= T <=200000 
		//2 <= W,H <= 40000
		// 계속하다보면 원점으로 다시 돌아옴 -> 다시 돌아오는 주기를 찾아야함 
		
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		int p = sc.nextInt();
		int q = sc.nextInt();
		int t = sc.nextInt();
		
		int timex = t % (2 * w);	
		int currentX = p;		
		int deltaX = 1;
	
		
		while(timex-- > 0) { //0이 될때까지 반복
			if(currentX == w)
				deltaX = -1;
			else if(currentX == 0)
				deltaX = 1;
			currentX += deltaX;
		}
		
		
		int deltaY = 1;
		int currentY = q;
		int timey = t% (2 * h);
		
		while(timey-- > 0) { //0이 될때까지 반복
			if(currentY == h)
				deltaY = -1;
			else if(currentY == 0)
				deltaY = 1;
			currentY += deltaY;
		}
		
		System.out.println(currentX + " "+ currentY);
		
		
	}

}
