package 단계1입출력과사칙연산;

import java.util.Scanner;

public class 꼬마정민 {

	public static void main(String[] args) {
		// 백준 11382
		//런타임에러로 인해서 long을 사용
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long sum = a + b + c;
		System.out.println(sum);
	}

}
