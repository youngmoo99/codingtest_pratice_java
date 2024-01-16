package 단계6심화1;

import java.util.Scanner;

public class 별찍기7 {

	public static void main(String[] args) {
		// 백준 2444
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=1; i<=n; i++) { // 별 증가
			for(int j=1; j <= n-i; j++) {
				System.out.print(" ");
			}
					
			for(int j=1; j <= 2 * i -1; j++) {
				System.out.print("*");
			}
				
			System.out.println(); 
		} 
		
		for(int i= n-1; i>=1; i--) {
			for(int j=1; j <= n-i; j++) {
				System.out.print(" ");
			}
					
			for(int j=1; j<= i*2-1; j++) {
				System.out.print("*");
			}
					
			System.out.println();		
		}
	}

}
