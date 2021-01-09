package baekjoon.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int idx = 0;
		for(int i = 0; i < 9; i++) {
			int number = Integer.parseInt(br.readLine());
		
			if(number > max) {
				max = number;
				idx = i + 1;
			}
			
			
		}
		br.close();
		System.out.println(max);
		System.out.println(idx);
	}
}
