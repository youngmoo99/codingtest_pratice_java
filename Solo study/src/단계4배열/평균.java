package 단계4배열;

import java.util.Arrays;
import java.util.Scanner;

public class 평균 {

	public static void main(String[] args) {
		// 백준 1546 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] score = new double[N];
		
		for(int i=0; i<N; i++) {
			score[i] = sc.nextDouble();
		}
		sc.close();
		
		Arrays.sort(score);
		double sum = 0;
		
		for(int i=0; i<N; i++) {
			sum += score[i] / score[N-1] * 100;
		}
			
		System.out.println(sum / N);
	}

}
