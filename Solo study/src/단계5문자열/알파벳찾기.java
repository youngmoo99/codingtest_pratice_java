package 단계5문자열;

import java.util.Scanner;

public class 알파벳찾기 {

	public static void main(String[] args) {
		// 백준 10809
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		int[] alphabetCount = new int[26];
		for(int i=0; i<alphabetCount.length; i++) {
			alphabetCount[i] = -1;
		}
		
		for(int i=0; i<S.length(); i++) {
			char c = S.charAt(i);
			int alphabet = c - 'a';
			if(alphabetCount[alphabet] != -1)
				continue;
			alphabetCount[alphabet] = i;
		}
		
		for(int i=0; i<alphabetCount.length; i++) {
			System.out.print(alphabetCount[i] + " ");
		}

	}

}
