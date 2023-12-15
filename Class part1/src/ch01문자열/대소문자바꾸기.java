package ch01문자열;

import java.util.Scanner;

public class 대소문자바꾸기 {

	public static void main(String[] args) {
		// 백준 2744 
		// 65 ~ 90 대문자 A-Z 
		// 97 ~ 122 소문자 a-z 
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String answer = "";
		for(int i=0; i<str1.length(); i++) {
			char c = str1.charAt(i);
			if(c >= 65 && c <= 90) {
				c += 32;
			}
			else {
				c -= 32;
			}
			answer += String.valueOf(c);
		}
		System.out.println(answer);
		

	}

}
