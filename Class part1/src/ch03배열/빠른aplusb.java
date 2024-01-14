package ch03배열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class 빠른aplusb {

	public static void main(String[] args) throws IOException{
		// 백준 15552
		
		//Scanner sc = new Scanner(System.in);
		
		//int T =sc.nextInt(); //시간초과로 스캐너 사용불가 
		// BufferedReader사용 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			String[] nums = br.readLine().split(" ");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			bw.write(a+b+"\n");
		}
		
		bw.flush();
		

	}

}
