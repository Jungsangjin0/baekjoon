package baekjoon.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek9020 {
	public static boolean[] prime = new boolean[10001];

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		get_prime();

		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		//n값을 반으로 나눠서 
		//한쪽은 -1 하고 다른한 쪽은 + 1해서 소수가 나올 때 까지 하기
		//짝수의값은 두 개의 소수로 나타낼 수 있기 때문에
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int left = n / 2;
			int right = n / 2;
			while(true) {
				if(!prime[left] && !prime[right]) {
					sb.append(left).append(" ").append(right).append("\n");
					break;

				}
				left--;
				right++;
			}
		}
		System.out.println(sb);
	}

	//에라토스테네스의 체
	public static void get_prime() {
		prime[1] = prime[0] = true;

		for(int i = 2; i * i <= prime.length; i++) {
			if(prime[i]) {
				continue;
			}
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
