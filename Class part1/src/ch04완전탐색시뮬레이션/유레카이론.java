package ch04완전탐색시뮬레이션;

import java.util.Scanner;

public class 유레카이론 {

	static boolean[] isEurekaNumber = new boolean[1001];
	
	public static void preprocess() {
		//1. k보다 작은 삼각수를 모두 구한다. 
		//k보다 작은 삼각수만 구하면된다. k는 최대 1000 
		int[] triangleNumbers= new int[50];
		int triangleNumberCount = 0;
		for(int i=1; ; i++) {
			int triangleNumber = i * (i+1) / 2;
			if(triangleNumber >= 1000) break;
			triangleNumbers[triangleNumberCount++] = triangleNumber;
		}
		
		//2. 구해진 삼각수 세개의 합으로 k를 나타낼 수 있는지 확인한다. 
		boolean[] isSumofTriangeNumber = new boolean[1001];
		for(int i=0; i<triangleNumberCount; i++) {
			for (int j=0; j< triangleNumberCount; j++) {
				int sum = triangleNumbers[i] + triangleNumbers[j];
				if(sum < 1000) isSumofTriangeNumber[sum] = true;
			}
		}
		
		for(int i = 1; i< 1000; i++) {
			if (!isSumofTriangeNumber[i]) continue;
			for(int j = 0; j< triangleNumberCount; j++) {
				int sum = i + triangleNumbers[j];
				if (sum <=1000) isEurekaNumber[sum] = true;
			}
		}
	}
	
	
	public static void main(String[] args) {
		// 백준 10448
		preprocess();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
			
		
		int able = 0;
		while(t-- >0) {
			int k = sc.nextInt();
			
			System.out.println(isEurekaNumber[k] ? "1" : "0");
			
			
		}
		
	}

}
