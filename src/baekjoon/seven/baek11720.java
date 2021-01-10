package baekjoon.seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek11720 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int range = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int total = 0;
		
		for(int i = 0; i < range;i++) {
			String ga = String.valueOf(str.charAt(i));
			total += Integer.parseInt(ga);
					
		}
		System.out.println(total);
		
	}

}
