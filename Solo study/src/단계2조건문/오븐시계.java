package 단계2조건문;

import java.util.Scanner;

public class 오븐시계 {

	public static void main(String[] args) {
		// 백준 2525
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		B += C;
		
		while(B >=60) {
			A++;
			B -= 60;
		}
		
		while(A > 23) {
			A -=24;
		}

		
		System.out.println(A+ " "+ B);

	}

}
