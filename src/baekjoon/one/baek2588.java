package baekjoon.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2588 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		br.close();

		StringBuilder sb = new StringBuilder();
		
		sb.append(a * ((b % 100) % 10))
		  .append("\n")
		  .append(a * ((b % 100) / 10))
		  .append("\n")
		  .append(a * (b / 100))
		  .append("\n")
		  .append(a * b);
		
		System.out.println(sb);
		
	}

}
