package 단계4배열;

import java.util.Scanner;

public class 바구니뒤집기 {

	public static void main(String[] args) {
		// 백준 10811
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = i+1;
		}
		
		for(int go =0; go<M; go++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int end = j;
			for(int change = i; change <end; change++) {
				int temp = 0; 			
				temp = arr[end-1];
				arr[end-1] = arr[change-1];
				arr[change-1] = temp;
				end--;
			}
		}
		
		for(int i =0; i<N; i++) {
			System.out.print(arr[i]+ " ");
		}
		

	}

}
