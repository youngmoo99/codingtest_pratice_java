package 단계6심화1;

import java.util.Scanner;

public class 크로아티아알파벳 {

	public static void main(String[] args) {
		// 백준 2941
		
		Scanner sc= new Scanner(System.in);
		String croatia = sc.next();
		
		int count = 0;
		
		for(int i=0; i<croatia.length(); i++) {
			
			char c = croatia.charAt(i);
			if(c == 'c') { // 처음이 c
				if (i < croatia.length() -1 ) {
					if(croatia.charAt(i+1) == '=' || croatia.charAt(i+1) == '-') { // c- c= 인경우
						i++;
					} 
				}
				
			}else if(c == 'd') { //처음이 d
				if (i < croatia.length() -1 ) {
				if(croatia.charAt(i+1) == 'z' && i<croatia.length()-2 &&croatia.charAt(i+2) == '=')  // dz=일경우 
					i+=2;
				
				else if (croatia.charAt(i+1) == '-')  // d-일경우
					i++;
				}
				
			}else if(c == 'l') { // l일경우
				if (i < croatia.length() -1 ) {
					if(croatia.charAt(i+1) == 'j')  // lj
						i++;
				}
				
				
			}else if(c=='n') { //n일경우
				if (i < croatia.length() -1 ) {
				if(croatia.charAt(i+1) == 'j') // nj
					i++;
				}
				
			}else if(c=='s') { //s일경우
				if (i < croatia.length() -1 ) {
				if(croatia.charAt(i+1) == '=') //s=
					i++;
				}
			}else if(c=='z') { //z일경우
				if (i < croatia.length() -1 ) {
				if(croatia.charAt(i+1) == '=') //z=
					i++;
				}
			}
				
			count++;
		}
		System.out.println(count);

	}

}
