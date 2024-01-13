package 단계4배열;

import java.util.Scanner;

public class 최댓값 {

	public static void main(String[] args) {
		// 백준 2562
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];	
		for(int i=0; i <9; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int seat = 0; //최댓값 자리
			
		for(int i=0; i <9; i++) {
			if(arr[i] > max) {
				max = arr[i];
				seat = i+1;			
			}

		}
		System.out.println(max);
		System.out.println(seat);
		
	}

}
