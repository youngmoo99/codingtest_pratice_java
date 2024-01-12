package 단계3반복문;

import java.util.Scanner;

public class A더하기B빼기3 {

	public static void main(String[] args) {
		// 백준 10950
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
			
		}
	}
}
