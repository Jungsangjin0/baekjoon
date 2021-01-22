package baekjoon.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int wX = Integer.parseInt(st.nextToken()) - x;
		int hY = Integer.parseInt(st.nextToken()) - y;
		
		int minX = x > wX ? wX : x;
		int minY = y > hY? hY : y;
			
		System.out.println(minX > minY ? minY : minX);
		
	}

}
