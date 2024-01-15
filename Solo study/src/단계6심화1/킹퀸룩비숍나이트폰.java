package 단계6심화1;

import java.util.Scanner;

public class 킹퀸룩비숍나이트폰 {

	public static void main(String[] args) {
		// 백준 3003 
		
		Scanner sc = new Scanner(System.in);
		int[] chess = {1,1,2,2,2,8};
		int[] oldchess = new int[chess.length];
		int[] pluschess = new int[chess.length];
		for(int i=0; i<chess.length; i++) {
			oldchess[i] = sc.nextInt();
			pluschess[i] = chess[i] - oldchess[i];
			System.out.print(pluschess[i]+ " ");
		}	
	}

}
