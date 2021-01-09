package baekjoon.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[42];
		int cnt = 0;
		for(int i = 0; i < 10; i++) {
			arr[(Integer.parseInt(br.readLine()) % 42)]++;
		}
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}	
		
}
