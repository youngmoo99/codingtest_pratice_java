package 단계3반복문;

import java.util.Scanner;

public class A더하기B8 {

	public static void main(String[] args) {
		// 백준11022
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=1; i<=T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.printf("Case #%d: %d + %d = %d%n",i , a, b, a + b);
		}
	}

}
