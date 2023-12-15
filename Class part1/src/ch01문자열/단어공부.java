package ch01문자열;

import java.util.Scanner;

public class 단어공부 {

	public static void main(String[] args) {
		// 백준 1157
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		int[] count = new int[26];
		
		for(int i =0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c <= 'Z') {
				count[c + 32 - 'a']++;
			} else {
				count[c - 'a']++;
			}
		}
		
		int maxCount = -1;
		char maxAlphabet = '?';
		for(int i=0; i<count.length; i++) {
			if(count[i] > maxCount) {
				maxCount = count[i];
				maxAlphabet = (char)('A' + i);
			}
			else if(count[i] == maxCount) {
				maxAlphabet = '?';
			}
		}
		
		System.out.println(maxAlphabet);
		
	}

}
