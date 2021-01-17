package baekjoon.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1978_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			
			//소수인 경우 true, 아닌경우 false
			boolean isPrime = true;
			int num = Integer.parseInt(br.readLine());
			//1은 소수가 아니므로 넘어감
			if(num == 1) {
				continue;
			}
			
			//루트n까지 만 탐색 // 반대로 생각하여 제곱으로 
			for(int j = 2; (j * j) <= num; j++) {
				//약수가 존재하면 false
				if(num % j == 0) {
					isPrime = false;
					break;
				}
			}
			//소수일경우 cnt++
			if(isPrime) {
				cnt++;
			}
		}
		//소수 인쇄
		System.out.println(cnt);
		
	}
}
