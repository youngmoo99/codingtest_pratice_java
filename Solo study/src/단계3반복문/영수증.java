package 단계3반복문;

import java.util.Scanner;

public class 영수증 {

	public static void main(String[] args) {
		// 백준 25304
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt(); // 총 금액
		int N = sc.nextInt(); // 물건 종류 수 
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			sum += a * b;
		}
		
		if(sum == X) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
