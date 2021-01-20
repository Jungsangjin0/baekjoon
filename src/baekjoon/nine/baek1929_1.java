package baekjoon.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1929_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		//N 까지 배열 만들기 N = 16 / 인덱스는 0 부터 17
		boolean[] prime = new boolean[N + 1];
		prime[0] = prime[1] = true; //0과 1은 소수가 아님
		
		//에라토스테네스의 체
		//2는 소수이기 때문에 false로 걸러짐
		//배열 default 값 false
		//제곱근만큼만 for문 돌리기
		for(int i = 2; i * i <= N; i++) {
			if(prime[i]) continue; // 약수일 경우 for문 다시 
			for(int j = i * i; j <= N; j+= i) {
				prime[j] = true;
			}
		}
	
		//추가
		for(int i = M; i <= N; i++) {
			if(!prime[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
		
	}
	
	
}
