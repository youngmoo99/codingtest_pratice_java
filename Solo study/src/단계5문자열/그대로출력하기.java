package 단계5문자열;

import java.util.Scanner;

public class 그대로출력하기 {

	public static void main(String[] args) {
		// 백준 11718
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) { //다음줄이 없을떄까지 while반복하여 출력
			String s = sc.nextLine();
			System.out.println(s);
		}
			
	}

}
