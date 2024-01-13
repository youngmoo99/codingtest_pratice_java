package 단계4배열;

import java.util.Scanner;

public class 공바꾸기 {

	public static void main(String[] args) {
		// 백준 10813
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		for(int k=0; k<N; k++) {
			arr[k] = k + 1; 
		}
		
		for(int go = 0; go < M; go++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int temp = 0;
			
			temp = arr[j-1];
			arr[j-1] = arr[i-1];
			arr[i-1] = temp;
				
		}
		
		for(int k=0; k<N; k++) {
			System.out.print(arr[k]+" ");
		}

	}

}
