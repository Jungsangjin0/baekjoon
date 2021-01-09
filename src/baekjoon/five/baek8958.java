package baekjoon.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek8958 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 1;
		int total = 0;
		StringBuilder sb = new StringBuilder();
		int range = Integer.parseInt(br.readLine());
		for(int i = 0; i < range; i++) {
			String str = br.readLine();
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == 'O') {
					total += cnt;
					cnt++;
				}else if(str.charAt(j) == 'X') {
					cnt = 1;
				}
				
			}
			sb.append(total).append("\n");
			total = 0;
			cnt = 1;
		}
		System.out.println(sb);
	}
}
