package baekjoon.seven;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedReader;

public class baek10809 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		
		for(char i = 'a'; i <= 'z'; i++) {
			System.out.print(str.indexOf(i) + " ");
		}
		
	}
}
