package baekjoon.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek10950 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		
		for(int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int one = Integer.parseInt(st.nextToken());
			int two = Integer.parseInt(st.nextToken());
			if(i < (a - 1)) {
				sb.append(one + two).append("\n");
			}else if(i == (a - 1)) {
				sb.append(one + two);
			}
		}
		br.close();
		System.out.println(sb);
	}
}
