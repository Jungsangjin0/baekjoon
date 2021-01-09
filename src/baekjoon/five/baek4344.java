package baekjoon.five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_case = Integer.parseInt(br.readLine());
		int[] arr;
		StringTokenizer st;
		for(int i = 0; i < test_case; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int N = Integer.parseInt(st.nextToken());
			arr = new int[N];
			
			double sum = 0;
			
			for(int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			
			double range = sum / N;
			double cnt = 0;
			
			for(int k = 0; k < N; k++) {
				if(arr[k] > range) {
					cnt++;
				}
			}
			System.out.printf("%.3f%%\n", (cnt/N) * 100);
		}
	
		
	}
}
