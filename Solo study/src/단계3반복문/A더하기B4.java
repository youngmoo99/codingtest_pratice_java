package 단계3반복문;

import java.util.Scanner;

public class A더하기B4 {

	public static void main(String[] args) {
		// 백준 10951
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
			
		}
		sc.close();
	}

}
