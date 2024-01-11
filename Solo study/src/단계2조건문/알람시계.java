package 단계2조건문;

import java.util.Scanner;

public class 알람시계 {

	public static void main(String[] args) {
		// 백준2884 
		
		//45분 일찍 울리기 
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		m -= 45;
		if(m <0) {
			h--;
			m = 60 + m;
		}
		
		if(h <0) {
			h = 23;
		}
		
		System.out.println(h + " "+ m);
		
		

	}

}
