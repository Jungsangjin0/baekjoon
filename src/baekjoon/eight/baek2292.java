package baekjoon.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2292 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int cnt = 1; //최소거리
		int roomNum = 1; //방 시작번호
		int addNum = 6; //추가될 방 숫자
		
		while(true) {
			
			if(A <= roomNum) {
				break;
			}
			roomNum += addNum; //최댓값
			addNum += 6; // 6배수
			cnt++;//최소거리 증가
		}
		System.out.println(cnt);

		
	}

}
