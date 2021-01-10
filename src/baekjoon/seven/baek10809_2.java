package baekjoon.seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek10809_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int[] arr = new int[26];
		for(int i =0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}
