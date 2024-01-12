package 단계3반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 빠른A더하기B {

	public static void main(String[] args) throws IOException{ // BufferedReader, BufferedWriter사용을 위해 예외처리 
		//백준 15552
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st; //문자열 분리 
	
		int T = Integer.parseInt(br.readLine());
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine(), " "); // 매반복마다 StringTokenizer 생성하여 공백마다 쪼갬 
			bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
		}
		br.close(); // 버퍼 닫기 
		
		bw.flush(); //버퍼 비우기
		bw.close(); //버퍼 닫기

	}



}
