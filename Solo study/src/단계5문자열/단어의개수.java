package 단계5문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 단어의개수 {

	public static void main(String[] args) {
		// 백준 1152
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine(); // 띄어쓰기 무시하고 입력 
		
		StringTokenizer st = new StringTokenizer(s, " ");
		
		System.out.println(st.countTokens()); // countTokens() 토큰수 출력
		

	}

}
