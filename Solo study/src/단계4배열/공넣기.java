package 단계4배열;

import java.util.Scanner;

public class 공넣기 {

	public static void main(String[] args) {
		// 백준 10810
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int go = 0; go<M; go++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			for(int change = i-1; change <= j-1; change++) {
				arr[change] = k;
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
