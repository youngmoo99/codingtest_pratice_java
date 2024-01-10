package 단계2조건문;

import java.util.Scanner;

public class 윤년 {

	public static void main(String[] args) {
		// 백준 2753
		
		Scanner sc = new Scanner(System.in);
		int years = sc.nextInt();
		
		if(years % 4 == 0 && years % 100 !=0 || years % 400 == 00) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		
		

	}

}
