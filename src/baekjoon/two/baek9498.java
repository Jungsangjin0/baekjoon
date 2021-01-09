package baekjoon.two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek9498 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		br.close();
		if(a <= 100 && a >= 90) {
			System.out.println("A");
		}else if(a <= 89 && a >= 80) {
			System.out.println("B");
		}else if(a <= 79 && a >= 70) {
			System.out.println("C");
		}else if(a <= 69 && a >= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
