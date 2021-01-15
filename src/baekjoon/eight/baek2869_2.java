package baekjoon.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//A만큼 올라가고 V에 못 미칠경우 미끄러짐  A - B 
//총 길이 V 
//총 길이 V - A

// 3 1 7 
// 3 1 8
public class baek2869_2 {


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());// 3
		int B = Integer.parseInt(st.nextToken());// 1
		int V = Integer.parseInt(st.nextToken());// 7
		
		int day = (V - A) / (A - B);
		//day = 총 길이 - 한번에 올라갈 수 있는거리 / 총 올라갈 수 있는 거리
		//day = 7 - 3 / 3 - 1
		if((V - A) % (A - B) != 0) {
			//총길이 - 한번에 올라갈 수 있는거리 / 총 올라갈 수 있는 거리 != 0
			//나머지 블록이 존재하기 때문에 하루 더 올라가야 함
			//그 후 정상이기때문에 미끄러지지 않음
			day++;
		}
		// + 1 을 하는 이유 
		// 처음 총 길이에 - A 즉, 하루치 올라가는것을 뺏기 때문에 하루를 더 더해야 한다.
		System.out.println(day + 1);
	}
}
