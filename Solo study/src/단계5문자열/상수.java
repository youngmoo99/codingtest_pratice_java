package 단계5문자열;

import java.util.Scanner;

public class 상수 {

	public static void main(String[] args) {
		// 백준 2908
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		String reA = "";
		String reB = "";
		
		for(int i=2; i>=0; i--) {
			reA= reA + String.valueOf(A.charAt(i));
			reB = reB + String.valueOf(B.charAt(i));
	
		}
		
		int aa = Integer.parseInt(reA);
		int bb = Integer.parseInt(reB);
		
		if(aa > bb)
			System.out.println(aa);
		else
			System.out.println(bb);
		

	}
}
