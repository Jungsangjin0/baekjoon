package baekjoon.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1011_1 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int distance = y - x;
			
			int max = (int)Math.sqrt(distance);//소수점 버림
			//딱 떨어지는 값 max가 변하는 처음지점의 거리는 max * max(max의 제곱근)
			//Math.sqrt() -> 루트 
			//true라면 max가 변하는 최초의 지점이고
			//그 곳의 count 값은 2 * max - 1
			if(max == Math.sqrt(distance)) {
				System.out.println(2 * max - 1);
				
			//max가 변하는 최초의 시점 부터 다음 max의 처음 시점까지의 값
			//이 구간 사이에는 max만큼 count가 반복된다
			//    max의최초    3번반복       3번반복         max의 다음 최초
	 		//distance  9| 10 11 12| 13 14 15 |16
			//count     5| 6  6  6 | 7  7  7  |7
			//max       3| 3  3  3 | 3  3  3  |4
			//첫번째로 묶인 반복 구간	
			//(max x max) < distance <= (max x max + max)
			//해당 구간의 count 값 = max x 2
			//선행조건에서 max x max부분은 걸러졌으니 최소조건은 제외
			}else if(distance <= max * max + max) {
				System.out.println(max * 2);
			//else if 구간을 지난 다음 3번반복 구간의 값은
				//count의 + 1이 됨
				//위에서 조건이 다 걸러졌으니 나머지 조건
			}else {
				System.out.println(max * 2 + 1);
			}
			
			
		}
		
		
	}
}
