package 단계3반복문;

import java.util.Scanner;

public class 별찍기2 {

	public static void main(String[] args) {
		// 백준 2439
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<N; i++) {
			sb.append(" ");		
		}	
		for(int i=N; i>0; i--) {
			sb.replace(i-1, i, "*");
			System.out.println(sb);
		}
				
	}

}
