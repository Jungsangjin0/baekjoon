package baekjoon.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek1712 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long A = Long.parseLong(st.nextToken()); //고정비용
		long B = Long.parseLong(st.nextToken()); //재료비+인건비 등등
		long C = Long.parseLong(st.nextToken());// 노트북가격
		
		//(n x C)  = A + (B x n)
		//(n x C) - (B x c) = A
		//n(C - B) = A
		// n = A/(C - B) 손익분기점  + 1 // + 1 은 이익나는 부분
		//손익분기점이 없다면 - 1
		// A / ( C - B) + 1 > 0 // 음수가 되는 값
		// A는 자연수 즉, (C - B) 가 음수인 값
		// C - B < 0
		// C - B 가 0이라면 -> 무한대로 증가 손익분기점이 없다고 볼 수 있다
		// C - B <= 0 -> C <= B
		
		if(C <= B) {
			System.out.println("-1");
		}else {
			System.out.println((A / (C - B)) + 1);
		}
		
		
		
	}
}
