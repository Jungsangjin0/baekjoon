package baekjoon.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int[] intArr = method(str);
		
		for(int j = 0; j < intArr.length; j++) {
			if(intArr[j] != 0) {
				sb.append((char)(j + 65) + ": ").append(intArr[j]).append("\n");
//				System.out.print((char)(j + 65) + ": ");
//				System.out.print(intArr[j] + "\n");
			}
		}
		System.out.println(sb);
	}

	public static int[] method(String str) {

		int[] intArr = new int[26];
		str = str.toUpperCase();
		System.out.println(str);
		for(int i = 0; i < str.length(); i++) {
			intArr[str.charAt(i) - 'A']++;
		}
		
		return intArr;
	}
}