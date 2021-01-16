package baekjoon.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baek10757_1 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String A = st.nextToken();
		String B = st.nextToken();
		
		int len1 = A.length() - 1; //인덱스 찾을 예정 인덱스는 0부터 
		int len2 = B.length() - 1;
		int remain = 0;//몫
		StringBuilder sb = new StringBuilder();
		
		//len1,2 가 1자리 수 일경우 length 값 = 1 -1 = 0
		while(len1 >= 0 || len2 >= 0) {
			//문자를 정수형으로 변경
			//만약 현재 덧셈할 자리수를 초과 한 경우 0으로 간주
			//100 + 10 => 100 + 010
			int c1 = len1 < 0 ? c1= 0 : A.charAt(len1) - 48;
			int c2 = len2 < 0 ? c2= 0 : B.charAt(len2) - 48;
			
			int sum = c1+c2+remain;
			
			//자리수를 더한 값에서 몫은 다음 자리수 덧셈을 위해 저장해두고
			//나머지 값은 문자열에 추가해준다.
			int c = sum % 10;
			remain = sum / 10;
			sb.insert(0, c);//나머지
			len1--;
			len2--;
		}
		//10자리를 추가해줌 
		// 0에 추가할 경우 마지막으로 넣은값이 offset 0 에 해당하고
		//처음에 있는값은 offset 1로 밀려남
		//insert 뒤에 값들은 String.valueOf처리되어있음
		if(remain > 0) {
			sb.insert(0, remain);
		}
		System.out.println(sb);
	}

}
