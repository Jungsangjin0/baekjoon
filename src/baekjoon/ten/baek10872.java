package baekjoon.ten;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek10872 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N  = Integer.parseInt(br.readLine());
		System.out.println(factorial(N));
		
	}
	
	public static int factorial(int number) {
		
		if(number == 0) {
			return 1;
		}else {
			return number * factorial(number - 1);
		}
	}

}
