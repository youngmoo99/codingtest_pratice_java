package 단계3반복문;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		// 백준 2739 
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d%n", N , i , N * i);
		}

	}

}
