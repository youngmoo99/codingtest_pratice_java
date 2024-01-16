package 단계6심화1;

import java.util.Scanner;

public class 팰린드롬인지확인하기 {

	public static void main(String[] args) {
		// 백준 10988
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String reverses = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			reverses += String.valueOf(c);
		}
		
		if(reverses.equals(s)) {	
			System.out.println(1);
		}else {	
			System.out.println(0);
		}
	}

}
