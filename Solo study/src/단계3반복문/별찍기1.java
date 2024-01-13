package 단계3반복문;

import java.util.Scanner;

public class 별찍기1 {

	public static void main(String[] args) {
		//백준 2438
		
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int N = sc.nextInt();
		for(int i = 1; i<=N; i++) {
			sb.append("*");
			System.out.println(sb);
		}
		
	}

}
