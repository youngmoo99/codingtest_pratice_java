package 단계5문자열;

import java.util.Scanner;

public class 다이얼 {

	public static void main(String[] args) {
		//백준 5622
		Scanner sc = new Scanner(System.in);
		String dial = sc.next();
		int sum = 0;
		for(int i =0; i<dial.length(); i++) {
			char c = dial.charAt(i);
			switch(c) {
				case 'A': case 'B': case 'C': 
					sum += 3;
					break;
				case 'D': case 'E': case 'F': 
					sum += 4;
					break;
				case 'G': case 'H': case 'I': 
					sum += 5;
					break;
				case 'J': case 'K': case 'L': 
					sum += 6;
					break;
				case 'M': case 'N': case 'O': 
					sum += 7;
					break;
				case 'P': case 'Q': case 'R': case 'S':  
					sum += 8;
					break;
				case 'T': case 'U': case 'V': 
					sum += 9;
					break;
				case 'W': case 'X': case 'Y': case 'Z':  
					sum += 10;
			}
		}	
		System.out.println(sum);
	}

}
