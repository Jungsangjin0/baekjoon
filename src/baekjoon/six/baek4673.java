package baekjoon.six;

public class baek4673 {
	
	
	
	public static void main(String[] args) {
		int[] arr = new int[10001];
		//index = 0 부터 10001 = 10000
		
		for(int i = 1; i < 10001;i++) {
			int check = d(i);
			if(check < 10001) {
				arr[check]++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int j = 1; j < arr.length; j++) {
			if(arr[j] == 0) {
				sb.append(j).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	
	
	public static int d(int num) {
		
		int value = num;
		
		while(num != 0) {
			value += num % 10;
			num /= 10;
			
		}
		
		return value;
	}
}