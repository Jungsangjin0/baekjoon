package baekjoon.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2775 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb =  new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[][] arr = new int[15][15];
		
		for(int i = 0; i < 15; i++) {
			//조건 a층의 b호에 살려면 자신의 아래 (a-1)층의 1호부터 b호까지
			//각 층의 1호마다 1명인 이유는 1층의1호일 경우 0층의 0호 수 + 0층의 1호 수
			//따라서 arr[i][1] = 1;
			arr[i][1] = 1; // 각각의 층의 1호에 1명씩 넣기
			arr[0][i] = i; //0층에 인구수 채우기
		}
		
		
		for(int i = 1; i < 15; i++) {
			for(int j = 2; j < 15; j++) {
				//조건 : a층의 b호에 살려면 자신의 아래(a-1)층의 1호부터 b호까지
				arr[i][j] = arr[i][j - 1]+ arr[i - 1][j];
			}
		}
		
		for(int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			sb.append(arr[k][n]).append("\n");
		}
		System.out.println(sb);
		
		
	}

}
