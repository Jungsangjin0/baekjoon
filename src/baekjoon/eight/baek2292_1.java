package baekjoon.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//범위 시작값을 기준으로 풀기
//1, 2, 8, 20, 38, 62..
//2 = 2 n=1
//8 = 2 + (6 * 1) n=2
//20 = 2 + (6 * 1) + (6 * 2) n=3
//38 = 2 + (6 * 1) + (6 * 2) + (6 * 3) n=4
//62 = 2 + (6 * 1) + (6 * 2) + (6 * 3) + (6 * 4)... n=5

//2 =  n=1
//8 = 2 + (6 * 1)     n=2 
//20 = 8 + (6 * 2)    n=3
//38 = 20 + (6 * 3)   n=4
//62 = 38 + (6 * 4)...n=5

//a(n) = a(n-1) + 6*(n -1) // (n > 1) 

// range = range + 6(n - 1) -> 다음 시작 번호
// cnt++;



public class baek2292_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int cnt = 1; //최소거리
		int range = 2; //최솟값
		
		if(A == 1) { //입력값이 1이면 1
			System.out.println(1);
		}else {// 규칙 시작은 2부터
			
			//최솟값 증가시키기
			while(range <= A) {
				range = range +(cnt * 6);
				cnt++;
			}
			System.out.println(cnt);
		}
	}

}
