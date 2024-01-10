package ch04완전탐색시뮬레이션;

import java.util.Scanner;

public class 회문인수 {
	
	private static int[] convertBase(int x, int b) {
		int len = 0;
		int copyX = x;
		while (copyX>0) {
			copyX  = copyX / b;
			len++;
		}
		int[] digit = new int[len];
		len = 0;
		while (x > 0) {
			digit[len++] = x % b;
			x = x /b;
		}
		
		return digit;
	}
	
	private static boolean isPalindrome(int[] digit) {
		for(int i = 0; i<digit.length / 2; i++)
			if(digit[i] != digit[digit.length -i -1])
				return false;
		return true;
	}


	public static void main(String[] args) {
		// 백준 11068 
		// 왼쪽부터 읽어도 오른쪽부터 읽어도 같은수를 회문인수 ex) 747 ,255(16진수로 표현하면 FF) 
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int x = sc.nextInt();
			boolean answer = false;
			//1. 가능한 모든 진법에 대해 진법을 변환 
			//2. 변환된 수가 회문이 될 수 있는지 확인 
			for(int i = 2; i<=64; i++) {
				int[] digit = convertBase(x, i);
				if(isPalindrome(digit)) {
					answer = true;
					break;
				}
			}
			System.out.println(answer ? "1" : "0");
		}
		
		
		
		
		
	}

	
	

}
