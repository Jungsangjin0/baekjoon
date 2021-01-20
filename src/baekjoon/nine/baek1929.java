package baekjoon.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//소수판별과 함께 변수 출력
public class baek1929 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); //3
		int M = Integer.parseInt(st.nextToken());// 16
		
		//배열 17크기 // 0 ~ 16 범위
		boolean[] prime = new boolean[M + 1];
		
		//2부터 배열 전체 크기만큼 돌기
		//배열의 마지막 인덱스 번호 M
		for(int i = 2; i <= M; i++) {
			if(prime[i]) continue; // 약수라면 패스
			//위에서 걸러지지않은 i를 추가 /소수/
			if(i >= N) {
				//i 가 N보다 크다면 // 입력한 범위안에 있다면
				//처음으로나오는 소수 추가
				sb.append(i).append("\n");
			}
			//i의 배수에 해당하는 값 true로 변경하기 M까지 돌면서  M배열의 
			//끝(인덱스의 시작은 0부터) 16이면 길이는 16 인덱스 끝번호는 15 
			for(int j = i + i; j <= M; j += i) {
				if(prime[j]) continue;
				prime[j] = true;
			}
		}
		
		System.out.println(sb);
		
	}
}
