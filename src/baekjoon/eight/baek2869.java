package baekjoon.eight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


//A만큼 올라가서 정상일 경우 미끄러지지 않는다  A >= V ? break;
//A만큼 올라왔지만 못미칠경우 B만큼 미끄러진다 if(total < V) total - B


public class baek2869 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int A = Integer.parseInt(st.nextToken()); //낮에 올라가는거리
		int B = Integer.parseInt(st.nextToken()); //밤에 미끄러지는 거리
		int V = Integer.parseInt(st.nextToken()); // 나무막대의 높이
		
		//걸리는 날짜
		int day = 1;
		//올라가고 미끄러지고도 올라간 거리
		int jump = A - B;
		//높이 - 낮에 올라가는 거리
		V -= A;
		//  걸리는날짜    하루 빼고 난 거리 / 미끄러지고도 올라간 거리
		int share = V / jump;
		
		if(V - (jump * share) <= 0) {
			//V(A빼고 남은 거리) - (하루에 올라갈 수 있는거리 * 걸리는시간) <= 0
			//다 올라옴
			day += share;
		}else {
			//남은거리 - (올라갈수잇는거리 * 걸리는시간) --> 하루를 더 올라가야함 
			day += share + 1;
		}
		System.out.println(day);
	}
}
