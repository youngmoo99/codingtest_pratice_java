package 단계6심화1;

import java.util.Scanner;

public class 그룹단어체커 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 백준 1316
		
		int N = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<N; i++) {
				if (check() == true) {
					count++;
				}
				
			}
		System.out.println(count);
			
		}
	
	public static boolean check() {
		boolean[] check = new boolean[26]; // 알파벳 수 만큼 배열생성 
		int prev = 0;
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++) {
			int c = str.charAt(i);
			// 앞에문자가 이번문자랑 다를경우 진행 
			if (prev != c) {
				//해당 문자가 처음나오는 경우 
				if( check[c-'a'] == false ) {
				check[c-'a'] = true;
				prev = c;
				}	
			//이미 나온경우 
				else {
					return false;
				}
			
			}else {	// 앞에문자가 이번문자랑 같을경우 
				continue; 
			}
		}
		//반복을 모두해도 false가 안나온경우 ture 리턴
		return true;
	}

}
