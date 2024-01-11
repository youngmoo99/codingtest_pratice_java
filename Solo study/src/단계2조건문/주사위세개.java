package 단계2조건문;

import java.util.Scanner;

public class 주사위세개 {

	public static void main(String[] args) {
		// 백준 2480
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int pay = 0;
		
		if(a== b && a==c && b==c) {
			pay = 10000 + a * 1000;
		}else if(a == b || a == c ) {
			pay = 1000 + a * 100;
		} else if(b == c) {
			pay = 1000 + b * 100;
		} else {
			int max = Math.max(Math.max(a, b),c);
			pay = max * 100;
		}

		System.out.println(pay);
	}

}
