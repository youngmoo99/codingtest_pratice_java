package 단계4배열;

import java.util.Scanner;

public class X보다작은수 {

	public static void main(String[] args) {
		// 백준 10871
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			if(arr[i] < X) {
				System.out.print(arr[i]+ " ");
			}
		}
		
		
	}

}
