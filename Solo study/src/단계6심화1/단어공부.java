package 단계6심화1;

import java.util.Scanner;

public class 단어공부 {

	public static void main(String[] args) {
		// 백준 1157
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int[] count = new int[26];
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c >= 'a') {
				count[c-'a']++;
			} else if(c <= 'Z') {
				count[c -'A']++;
			}	
		}
		
		int maxcount = -1;
		char maxalpha = '?';
		for(int i=0; i<count.length; i++) {
			if(maxcount < count[i]) {
				maxcount = count[i];
				maxalpha = (char) ('A' + i);
			}
			else if(count[i] == maxcount)
				maxalpha = '?';
		}
		
		System.out.println(maxalpha);
		

	}

}
