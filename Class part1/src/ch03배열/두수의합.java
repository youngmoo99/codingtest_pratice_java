package ch03배열;

import java.util.Scanner;

public class 두수의합 {

	public static void main(String[] args) {
		// 백준 3273 
		
		//이중반복을 사용할경우 시간복잡도 O(N^2) 으로 인해 시간초과 
		

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int x = sc.nextInt();
		
		boolean[] exist = new boolean[1000001];
		for(int i=0; i<n; i++)
			exist[arr[i]] = true; // arr에 값이 있을경우 true 
		
		int ans = 0;
		for(int i=0; i<n; i++) {
			int pairValue = x- arr[i]; // x에서 값을뺀 값 
			if(0 <= pairValue && pairValue <= 1000000)
				ans += exist[pairValue] ? 1:0;
		}
		
		System.out.println(ans / 2);
		
	}

}
