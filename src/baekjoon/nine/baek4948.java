package baekjoon.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek4948 {

	//입력값 123456 x 2 = 246913 배열은 하나 더 + 1
	public static boolean[] prime = new boolean[246913];
	//1부터 누적하여 각 index 까지의 소수의 개수를 담기
	public static int[] count_arr = new int[246913];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		get_prime();
		get_count();
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) break; // 0 입력 시 while문 종료
			
			//n보다 크고 2n보다 작거나 같은범위안에있는 소수의 갯수 
			//원래라면 2~ 4까지의 수 하면 3이지만 2<= n <= 4 -> 2,3,4 -> 3개 (4 - 2 + 1)
			//n보다 크고 2n보다작거나 같은범위 
			//ex) 2 < n <= 4 -> 3, 4-> 2개 (4 - 2)
			
			sb.append(count_arr[2 * n] - count_arr[n]).append("\n");
		}
		System.out.println(sb);
		
	}
	
	
	public static void get_prime() {
		prime[0] = prime[1] = true;
		//제곱근만큼 돌리기	  //배열 전체에 소수 구하기 적용 //입력값에 따라 달리지는게 아님 246913
		for(int i = 2; i * i <= prime.length;i++) {
			//약수이면 continue
			if(prime[i]) continue;
			//배수에 true 값 넣기 //246192 
			//나올 수 있는 최댓값은 123456 x 2 = 246912 
			//배열의 크기(길이)는 246193
			//따라서 배열의 길이보다는 작아야한다.
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
	
	public static void get_count() {
		int count = 0;
		for(int i = 2; i < prime.length; i++) {
			if(!prime[i]) count++; //소수라면 count++
			
			count_arr[i] = count;
		}
	}
}
