package ch01문자열;

import java.util.Scanner;

public class 애너그램만들기 {
	
	public static int[] getAlphabetCount(String str) { // 함수형으로 따로 빼기
		int[] count = new int[26];
		for(int i = 0; i< str.length(); i++) {
			count[str.charAt(i) - 'a']++;
		}
		return count;
	}
	public static void main(String[] args) {
		// 백준 1919 
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		int[] countA = getAlphabetCount(str1); //알파벳 소문자 26개
		int[] countB = getAlphabetCount(str2); //알파벳 소문자 26개
		
		
		
		
		int answer= 0 ;
		for(int i=0; i<26; i++) 
			answer += Math.abs(countA[i] - countB[i]); //abs 절대값 
		
		System.out.println(answer);
	}

}
