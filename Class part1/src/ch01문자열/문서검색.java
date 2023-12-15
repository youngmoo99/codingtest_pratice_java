package ch01문자열;

import java.util.Scanner;

public class 문서검색 {
	//백준 1543
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine(); // next는 공백전까지 입력 
		String b = sc.nextLine();
		
		int count = 0;
		int startIndex = 0;
		
		while (true) {
			int findIndex = a.indexOf(b, startIndex); // startIndex부터 처음으로 등장하는 b 문자열을 찾는다. 찾았다면 일치하는 시작 인덱스 반환 찾지 못한경우 -1
			
			if(findIndex <0)
				break;
			
			startIndex = findIndex + b.length();
			count++;
		}
	
		System.out.println(count);
	
	}
}
