package baekjoon.seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2675 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		String S;
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int R = Integer.parseInt(st.nextToken());
			S = st.nextToken();
			for(int j = 0; j < S.length(); j++) {
				for(int k = 0; k < R; k++) {
					sb.append(S.charAt(j));
				}
			}
			sb.append("\n");
		}
		br.close();
		System.out.println(sb);
	}
}
