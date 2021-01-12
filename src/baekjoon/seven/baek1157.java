package baekjoon.seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1157 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().toUpperCase();
		int[] arr = new int[26];
		for(int i = 0; i < str.length(); i++) {
			arr[(int)str.charAt(i) - 65]++;
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i + 65);
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		br.close();
		System.out.println(ch);
	}
}
