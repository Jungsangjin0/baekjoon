package baekjoon.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class baek1193_1 {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		//해당 범위의 칸 갯수 -> 기본 처음 1 이 1개
		int cross_count = 1;
		
		//해당 범위 전 칸의 누적 갯수 -> 처음 1개의 전 칸의 누적은 0
		int prev_count_sum = 0;
		
		while(true) {
			
			
			//지금 해당 범위에 a가 존재한다.
			if(a <= cross_count + prev_count_sum) {
				
				if(cross_count % 2 == 1) {
					//칸의 갯수가 홀수
					//현재 범위의 값을 나눴을 때 홀수면 아래에서 위로 향함 
					//즉, 분자가 더 크게 시작.
					//분모가 1부터 시작이고 분자는 cross_count - 분자
					//분모 + 분자 = 현재 대각선 수 + 1
					//분모 -> a(입력값) - (prev_count_sum) = 이동할 값
					//분자 -> cross_count(현재 대각선 수) - 분모값  + 1 = (분자와분모의 총합)
					
					//분자 = 현재 대각선 수 + 1 - 분모 or 분자 = 현재 대각선 수 -(분모 - 1)
					
					System.out.println((cross_count + 1 - (a - prev_count_sum)) + "/" + (a - prev_count_sum));
					break;
				}else {
					//칸의 갯수가 짝수
					//분모가 더 크게 시작
					//a - prev_count_sum -> 현재 대각선에서 이동할 칸의 수 0이 될 수 없음
					System.out.println((a - prev_count_sum) + "/" + (cross_count + 1 -(a - prev_count_sum)));
					break;
				}
			}else {
				prev_count_sum += cross_count;
				cross_count++;
			}
		}
	}
}
