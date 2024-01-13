package 단계3반복문;

import java.util.Scanner;

public class A더하기B5 {

	public static void main(String[] args) {
		// 백준 10952
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b==0)
				break;
			System.out.println(a+b);
		}

	}

}
