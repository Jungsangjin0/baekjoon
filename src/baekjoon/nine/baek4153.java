package baekjoon.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek4153 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			int dA = a * a;
			int dB = b * b;
			int dC = c * c;
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			if(dA + dB == dC) {
				System.out.println("right");
			}else if(dB + dC == dA) {
				System.out.println("right");
			}else if(dC + dA == dB) {
				System.out.println("right");
			}else {
				System.out.println("wrong");
			}
		}

	}

}
