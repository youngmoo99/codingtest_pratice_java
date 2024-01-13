package 단계5문자열;

import java.util.Scanner;

public class 숫자의합 {

	public static void main(String[] args) {
		// 백준 11720
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String numstr = sc.next();
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			char c = numstr.charAt(i);
			int num = c - '0';
			sum += num;
		}
		System.out.println(sum);
		
	}

}
