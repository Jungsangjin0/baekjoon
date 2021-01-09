package baekjoon.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2577 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = String.valueOf((Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()))); 
		int[] arr = new int[10];
		
		for(int i = 0; i < str.length(); i++) {
			String a = String.valueOf(str.charAt(i));
			arr[Integer.parseInt(a)]++;
		}
		for(int result : arr) {
			System.out.println(result);
		}
		
	}
}
