package baekjoon.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1011 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			long x = Integer.parseInt(st.nextToken());
			long y = Integer.parseInt(st.nextToken());
			
			long distance = y - x;
			long answer = 0;
			long cnt = 0;
			for(long j = 1; answer< distance;j++ ) {
				answer += j;
				cnt++;
				if(answer >= distance) {
					break;
				}
				answer += j;
				cnt++;
				
			}
			System.out.println(cnt);
		}
		
		
	}
}
