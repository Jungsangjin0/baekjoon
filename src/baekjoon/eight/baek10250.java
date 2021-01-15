package baekjoon.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek10250 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken()); //층수 세로
			int W = Integer.parseInt(st.nextToken()); //방수 가로
			int N = Integer.parseInt(st.nextToken()); //손님번 수
			
//			int Y;
//			int X;
			//앞자리는 손님번수 % 층수
			//단, 손님번수 % 층수 = 0 이면 0층이 되어버리기 때문에
			//층수 가 Y가된다. 끝층
			if(N % H == 0) {
//				Y = H * 100;
//				X = N / H;
				sb.append((H * 100) + (N / H)).append("\n");
				
			}else {
//				Y =(N % H) * 100;
//				X = (N / H) + 1;
				sb.append(((N % H) * 100) + ((N / H) + 1)).append("\n");
			}
//			int YYXX = Y + X;
//			System.out.println(YYXX);
//			sb.append(YYXX).append("\n");
			
			//방 호수
			//(N / H) + 1 방 호수는 1부터 시작이여서
			//하지만 N = 6 H = 6일경우 2가 된다 따라서 N % H == 0 이면 그냥그 숫자 그대로
			//아니면 +1을 처리해준다.
		}
		System.out.println(sb);
	}
}
