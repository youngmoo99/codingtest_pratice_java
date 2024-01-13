package 단계5문자열;

import java.util.Scanner;

public class 문자열 {

	public static void main(String[] args) {
		// 백준 9086
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			String s = sc.next();
			System.out.println(s.charAt(0) +""+ s.charAt(s.length()-1));
		}

	}

}
