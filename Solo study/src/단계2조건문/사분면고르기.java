package 단계2조건문;

import java.util.Scanner;

public class 사분면고르기 {

	public static void main(String[] args) {
		// 백준 14681
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int answer = 0;
		if(x <0 && y>0)
			answer = 2;
		else if(x>0 && y>0)
			answer = 1;
		else if(x<0 && y<0)
			answer = 3;
		else 
			answer = 4;
		
		System.out.println(answer);
	}

}
