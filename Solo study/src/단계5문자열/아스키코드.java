package 단계5문자열;

import java.util.Scanner;

public class 아스키코드 {

	public static void main(String[] args) {
		// 백준 11654
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		char c = s.charAt(0);
		
		System.out.println((int) c);
		
	}

}
