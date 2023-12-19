package ch04완전탐색시뮬레이션;

import java.util.Scanner;

public class 진법변환2 {

	public static void main(String[] args) {
		// 백준 11005
		// B진법 변환 
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		
		String answer = "";
		//1. N을 b로 나눈 나머지를 구하고, b로 나누자
		//2. 이때 가장 마지막 나머지부터 가장 앞 자리값이 된다. 
		while( n >0) {
			int d = n % b;
			if(d<10) answer += d;
			else answer += (char)(d- 10 + 'A');
			n = n / b;
		}
		
		for(int i = answer.length() - 1; i >=0; i--)
			System.out.print(answer.charAt(i));
		System.out.println();
		
	}

}
