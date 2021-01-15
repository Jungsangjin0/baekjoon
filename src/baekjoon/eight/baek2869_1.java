package baekjoon.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek2869_1 {


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int day = 0;
		int high = V;
		int low = 0;
		int mid = V / 2;
		int jump = A - B;

		while(true) {
			//mid까지 도착한 날짜
			day = mid / jump;
			
			if((V - mid) > A) {
				//더 올라가야함
				low = mid;
			}else if(V - mid == A) {
				//정확히 올라왔을 경우
				break;
			}else {
				
			}
			
			
		}
	}
}
