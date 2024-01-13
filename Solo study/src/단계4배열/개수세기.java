package 단계4배열;

import java.util.Scanner;

public class 개수세기 {

	public static void main(String[] args) {
		// 백준 10807
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<N; i++) {
			if(b == arr[i]) {
				count++;
			}
		}		
		System.out.println(count);		
	}

}
