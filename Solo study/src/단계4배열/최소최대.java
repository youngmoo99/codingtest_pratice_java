package 단계4배열;

import java.util.Scanner;

public class 최소최대 {

	public static void main(String[] args) {
		// 백준10818
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			if(arr[i] > max) {
				max = arr[i];
			} 
			if(arr[i] < min) {
				min = arr[i];
			}
		}		
		System.out.println(min + " "+ max);
			
	}

}
