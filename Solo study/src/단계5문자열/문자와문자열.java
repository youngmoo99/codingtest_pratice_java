package 단계5문자열;

import java.util.Scanner;

public class 문자와문자열 {

	public static void main(String[] args) {
		// 백준 28966
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int i = sc.nextInt();
		
		System.out.println(S.charAt(i-1));

	}

}
