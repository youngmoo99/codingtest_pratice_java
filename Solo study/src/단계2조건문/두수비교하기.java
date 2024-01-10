package 단계2조건문;

import java.util.Scanner;

public class 두수비교하기 {

	public static void main(String[] args) {
		// 백준 1330 
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A > B) {
			System.out.println(">");
		} else if(A < B) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
		

	}

}
