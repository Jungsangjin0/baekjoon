package baekjoon.four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1110 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt =  0;
		int N = Integer.parseInt(br.readLine());
		br.close();
		int a = N;

		while(true) {
			N = ((((N / 10) + (N % 10)) % 10) + ((N % 10) * 10));
			cnt++;
			if(N == a) {
				break;
			}
		}
		System.out.println(cnt);
		
	}

}
