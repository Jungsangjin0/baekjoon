package baekjoon.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek1193 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine());	
		int max = 0;
		int line = 0; //몇번째 라인인지
		
		for(int i = 1; i <= X; i++) {
			//X = 14
			//1 + 2 + 3 + 4 + 5
			max += i;
			if(max >= X) {
				//line = 5
				line = i;
				break;
			}
		}
		
		if(line % 2 == 0) {
			//분자가 크게 시작
			System.out.println(line - (max - X) + "/" + (1 + max - X));
		}else {
			//분모가 크게 시작
			//분모 증가 1, 2, 3, 4, 5 ... = line 값과 같음
			//line = 1? 분모값 1 line = 2 분모값 2.... 
			//line - (이동한 값) // 이동한 값 ==  max= 누적 배열수 - X = 입력한 배열 수
			// 분자는 기본값이 1
			// 분자 -> (기본값(1) + (max(최대 누적 배열 수) - X(입력한 배열 수))
			System.out.println((1 + max - X) + "/" + (line -(max -X)));
		}
		
		
	}
}
