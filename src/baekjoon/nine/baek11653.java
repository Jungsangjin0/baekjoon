package baekjoon.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek11653 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//제곱근까지만 검사하면 됨
		for(int i = 2; i * i <= N; i++) {
			while(N % i == 0) {
				System.out.println(i);
				N /= i;
			}
		}
		if(N != 1) {
			System.out.println(N);
		}
		
	}

}
