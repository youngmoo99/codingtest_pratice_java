package 단계5문자열;

import java.util.Scanner;

public class 문자열반복 {

	public static void main(String[] args) {
		// 백준 2675
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int R = sc.nextInt();
			String S = sc.next();
			StringBuffer sb = new StringBuffer();
			
			for(int j=0; j<S.length(); j++) {
				for(int k = 0; k<R; k++) {
					sb.append(S.charAt(j));
				}
			}		
			
			String answer = String.valueOf(sb);
			System.out.println(answer);					
		}

	}

}
