package baekjoon.three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2742 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = a; i >= 1; i--) {
			sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
}
