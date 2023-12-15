package ch01문자열;

import java.util.Scanner;

public class 소금폭탄 {

	public static void main(String[] args) {
		// 백준 13223
		
		Scanner sc = new Scanner(System.in);
		
		String atime = sc.next();
		String btime = sc.next();
		
		String acurrent[] = atime.split(":");
		String bcurrent[] = btime.split(":");
		
		int ahour = Integer.parseInt(acurrent[0]);
		int amin = Integer.parseInt(acurrent[1]);
		int asec = Integer.parseInt(acurrent[2]);
		int amounta = ahour * 3600 + amin * 60 + asec;
		
		int bhour = Integer.parseInt(bcurrent[0]);
		int bmin = Integer.parseInt(bcurrent[1]);
		int bsec = Integer.parseInt(bcurrent[2]);
		int amountb = bhour * 3600 + bmin * 60 + bsec;
		
		int needamount = amountb - amounta;
		
		if(needamount <= 0) {
			needamount += 24 * 3600;
		}
		int needhour = needamount / 3600;
		int needmin = (needamount % 3600) / 60;
		int needsec = needamount % 60;
		
		System.out.printf("%02d:%02d:%02d",needhour,needmin,needsec);
	}
}

