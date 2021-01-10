package baekjoon.six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1065 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		System.out.println(check(num));
	}
	
	
	public static int check(int num) {
		
		int cnt = 0;
		
		if(num < 100) {
			return num;
		}else {
			cnt = 99;
			if(num == 1000) {
			//1000은 한수가 아닐뿐더러 코드자체가 100의 자리 까지만 짜여져 있음
				num = 999;
			}
		} 
		for(int i = 100; i <= num; i++) {
			//
			int one = i / 100;
			int two = (i / 10) % 10;
			int three = i % 10;
			
			if((one - two) == (two - three)) {
				cnt++;
			}
		}
		return cnt;
	}

}
