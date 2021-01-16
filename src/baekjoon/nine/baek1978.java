package baekjoon.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2부터 N-1 까지 나누기 
//시간복잡도O(N)
public class baek1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		br.readLine();
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			
			int num = Integer.parseInt(st.nextToken());
			int check = 0;
			
			if(num == 1) {
				continue;
			}
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					check++;
				}
			}
			//소수 x 소수 처리해야함
			if(check == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}
