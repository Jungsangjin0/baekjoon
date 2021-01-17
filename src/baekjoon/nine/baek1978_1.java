package baekjoon.nine;


//에라토스테네스의 체
//체크할 배수만큼만 반복문을 돌게 하는 것
//이미 0으로 체크되어버린 수의 배수는 확인하지 않는다.
public class baek1978_1 {
	
	public static void main(String[] args) {
		
		//120으로 먼저 해보기
		//기본 default false
		boolean[] arr = new boolean[121];
		//0과 1은 소수가 아니기 때문에 제외
		arr[0] = arr[1] = true;
		
		//전체를 돌 필요없이 루트 n까지만 찾으면 됨
		//반대로 제곱근으로 처리
		for(int i = 2; (i * i) <= 120; i++) {
			//미리 배수에 의해 true값이 된 경우 pass
			if(arr[i] == true) {
				continue;
			}
			//i의 배수에 true 값 넣기 
			for(int j = i * i; j <= 120; j += i) {
				arr[j] = true;
			}
		}
		for(int i = 0; i < arr.length; i ++) {
			System.out.println(i +" : " + arr[i]);
		}
		
 	}
}
