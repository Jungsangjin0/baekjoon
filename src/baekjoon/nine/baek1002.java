package baekjoon.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1002 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int x1 = 0;
		int y1 = 0;
		int r1 = 0;
		int x2 = 0;
		int y2 = 0;
		int r2 = 0;
		StringTokenizer st;
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			
			x1 = Integer.parseInt(st.nextToken());			
			y1 = Integer.parseInt(st.nextToken());			
			r1 = Integer.parseInt(st.nextToken());			
			x2 = Integer.parseInt(st.nextToken());			
			y2 = Integer.parseInt(st.nextToken());			
			r2 = Integer.parseInt(st.nextToken());			
			
			if(x1 == x2 && y1 == y2 && r1 == r2) {
				System.out.println(-1);
			}else if((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) > (r1 + r2) * (r1 + r2)) {
				System.out.println(0);
			}
			
		}
	}
}
