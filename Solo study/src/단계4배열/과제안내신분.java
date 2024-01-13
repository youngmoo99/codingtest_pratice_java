package 단계4배열;

import java.util.Scanner;

public class 과제안내신분 {

	public static void main(String[] args) {
		// 백준 5597
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[30];
		
	
		for(int i = 0; i<28; i++) {
			int student = sc.nextInt();
			arr[student -1] = 1;	
		}
		
		for(int i = 0; i<30; i++) {
			if(arr[i] == 0) {
				System.out.println(i+1);
			}
		}
		
	}

}
