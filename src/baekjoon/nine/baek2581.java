package baekjoon.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek2581 {
	
	public static boolean[] isPrime;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//범위  M이상 N이하의 자연수 M <= number <= N
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		
		//배열의 시작은 0
		isPrime = new boolean[N + 1]; 
		getIsPrime();
		
		//소수의 합
		int sum = 0;
		//소수의 최솟값
		int min = 10001;
		for(int i = M; i <= N; i++) {
			
			//소수일 때
			if(isPrime[i] == false) {
				//현재 i값을 sum에 추가
				sum += i;
				//첫 소수가 최솟값임
				//첫 소수가 무조건 들어갈 수 있는 조건
				if(min > i) {
					min = i;
				}
			}
		}
		//소수가 없다면
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
	public static void getIsPrime() {
		//에라토스테네스 체 알고리즘
		isPrime[0] = true;
		isPrime[1] = true;
		//반만큼만 돌리기 isPrime의 루트 // 반대로 제곱으로
		//기본적으로 배열 선언 시 false값 2는 기본적으로 false로 되어있기 때문에
		//체크하지않음
		//<= 인 이유는 length만큼 배열을 돌아야하기 때문에
		//배열의 크기가 N + 1 배열의 시작은 0 
		//즉, 0부터시작이면 < 이겠지만 자연수의 값이므로 <= 배열의 크기만큼 돌려야한다.
		for(int i = 2; (i * i) <= isPrime.length; i++) {
			//이미 체크가 된경우 pass 배수가 존재하여서 체크 됨
			if(isPrime[i]) {
				continue;
			}
			//i의 배수에 true값으로 변경해주기
			//j <isPrime.length(미만)인 이유 
			//예를 들어 120 일 경우 배열은0 부터시작함
			//범위는 1 ~ 120 인데 0 ~120 이기에 배열의 길이는 총 121
			//따라서 미만으로 처리
			for(int j = i * i; j < isPrime.length; j+=i) {
				isPrime[j] = true;
			}
		}
	}
}
