package 단계3반복문;

import java.util.Scanner;

public class 코딩은체육과목입니다 {

	public static void main(String[] args) {
		// 백준 25314
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String answer = "";
		while (N > 1) {
			answer += "long ";
			N -= 4;
		}
		System.out.println(answer+"int");
			
	}

}
