package baekjoon.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//두 원의 접점을 찾는 문제
// 1. 두 원의 접점의 개수가 무한일 때
// 1-1. x1 = x2 , y1 =y2, r1 = r2
// 2. 접점이 없을 때
// 두 점 사의 거리가 각 반지름의 합보다 클 때
// 두 점 사의 거리 계산법 -> (x2 - x1)^2 + (y2 - y1)^2
// 2-1. (x2 - x1)^2 + (y2 - y1)^2 < (r1 + r2)^2
// 루트를 씌우는게 맞으나 루트보다 제곱의 계산이 수월
// 3 한 원안에 다른원이 있으면서 접하지 않을 때
// 반지름의 차이가 두원의 중심 차이가 보다 클 때
// 반지름의 길이가 같지 않으면서 반지름의 차이가 두 원간의 중점 거리보다 크면 된다.
// 4 내접할 때
// 두 원의 거리와 반지름의 차이가 같을 떄
// (x2 - x1)^2 + (y2 - y1)^2 = (r2 - r1)^2
// 5 외접할 떄
// 두원의 반지름의 합과 원의 거리가 같을 때
// (x2 - x1)^2 + (y2 - y1)^2 = (r1 + r2)^2
// 6. 그 외의 조건
// 그 외의 조건은 접점이 2개라고 할 수 있다.

public class baek1002 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//테스트 케이스
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			sb.append(dot(x1, y1, r1, x2, y2, r2)).append("\n");
			
			
		}
		System.out.println(sb);
	}
	
	public static int dot(int x1, int y1, int r1, int x2, int y2, int r2) {
		
		int distance = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
//		int distance = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * y2 - y1));
		
		//무한 접점일 때 
		//반리즘과 원의 중심이 같을 때
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
			
		}else if(distance > Math.pow((r2 + r1), 2)) {
			//두 원의 거리가 반지름의 합보다 클 떄
			return 0;
			
		}else if(distance < Math.pow((r2 - r1), 2)) {
			//원 안에 원이 있으나 접점이 없을 때
			//두 중심거리 차이가 반지름의 차이보다 작을 떄
			return 0;
		}else if(distance == Math.pow(r2 - r1, 2)) {
			//내접하면서 두 원의 반지름의 차이와 두 중심의 거리가 같을 떄
			return 1;
		}else if(distance == Math.pow((r2 + r1), 2)) {
			//외접하면서 두 원의 반지름의 합과 두 중심의 거리가 같을 때
			return 1;
		}else {
			//나머지는 2개의 접점을 갖는다
			return 2;
		}
		
		
	}
}
