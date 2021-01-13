package baekjoon.seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2908_1 {
	
	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		String A = st.nextToken();
		String B = st.nextToken();
		
		String temp = "";
		for(int i = (A.length() - 1); i >= 0; i--) {
			temp += A.charAt(i);
		}
		A = temp;
		
		temp = "";
		for(int i = (B.length() - 1); i >= 0; i--) {
			temp += B.charAt(i);
		}
		B = temp;
		
		int a = Integer.parseInt(A);
		int b = Integer.parseInt(B);
		
		System.out.println(a > b ? a : b);
		
	}

}
