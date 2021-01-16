package baekjoon.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2839 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		//5로만 나눠지는 경우 //가장 적은 경우의 수
		if(N % 5 == 0) {
			System.out.println(N / 5);
			return;
			
		}else {
			//5와 3으로 구해지는 경우
			int amount = N / 5;
			for(int i = amount; i > 0; i--) {
				int temp = N - (i * 5);
				if(temp % 3 == 0) {
					System.out.println(i + (temp/3));
					return;
				}
			}
		}
		//3으로만 나눠지는 경우
		if(N % 3 == 0) {
			System.out.println(N / 3);
		}else {
			System.out.println(-1);
		}
		

	}

}
