package ch03배열;

import java.util.Scanner;
public class 줄세우기 {

	public static void main(String[] args) {
		// 백준 10431
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		while (P-- > 0) {
			int T = sc.nextInt();
			int[] h= new int[20];
			for(int i=0; i<20; i++) {
				h[i] = sc.nextInt();
			}
			
			int cnt = 0;
			int[] sorted = new int[20];
			
			for(int i=0; i<20; i++) {
				//1. 자신보다 먼저 줄을 선 학생중 자신보다 키가 큰 학생이 있는지 찾는다 
				boolean find = false;
				for(int j=0; j<i; j++) {			
					if (sorted[j] > h[i]) {
						//2. 자신보다 큰 학생중 가장 앞에 있는 학생(A) 앞에 선다.					
						//3. A와 A뒤의 모든 학생들은 공간을 만들기 위해 한 발씩 뒤로 물러난다. 
						find = true;
						for(int k = i-1; k >= j; k--) {
							sorted[k + 1] = sorted[k];
							cnt++;
						}
						sorted[j] = h[i];
						break;				
					}
				}
					//1-1. 자신보다 큰 학생이 없다면 줄의 가장뒤로 가서 선다.,
					if (!find) sorted[i] = h[i];
			}
			System.out.println(T+" "+cnt);
		}
	}
}
				

		

		
		
	
		
		
	


