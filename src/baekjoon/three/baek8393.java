package baekjoon.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek8393 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		br.close();
		int b = 0;
		
		for(int i = a; i > 0; i--) {
			b += i;
		}
		System.out.println(b);
		
	}
}
