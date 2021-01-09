package baekjoon.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2884 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		br.close();
		
		if(b - 45 < 0 && a == 0) {
			//
			a = 23;
			b += 15;
			
		}else if(b - 45 < 0) {
			//
			a -= 1;
			b += 15;
		}else if(b - 45 >= 0) {
			b -= 45;
		}
		System.out.println(a + " " + b);
		
	}

}
