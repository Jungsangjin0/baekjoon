package baekjoon.seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1316 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int range = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i = 0; i < range; i++) {
			if(check(br.readLine())) {
				//true라면 그룹함수 count
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	
	public static boolean check(String str) {
		boolean[] check = new boolean[26];
		int pre = 0;
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			
			
			if(pre != now) {
				if(check[now - 'a'] == false) {
					check[now - 'a'] = true;
					pre = now;
				}
				else {
					//그룹단어가 되지못하기 때문에 false로 for문 종료
					return false;
				}
			}
		}
		//모든 for문이 성립할 때 main에 true 값 돌려주기
		return true;
	}

}
