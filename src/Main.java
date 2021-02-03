import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[] {1,1,3,3,0,1,1};
		int[] answer = {};
		answer = new int[10];
		for(int i = 0; i < 10; i++) {
			System.out.println(answer.length);
			answer[i] = i;
			System.out.println(answer[i]);
		}
		
		
	}
	
	public static void test(int[] arr) {
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				list.add(arr[i]);
			}else {
				if(arr[i -1] == arr[i]) {
					continue;
				}else {
					list.add(arr[i]);
				}
			}
		}
		
		int[] arr1 = new int[list.size()];
		
		for(int j = 0; j < arr1.length;j++) {
			arr1[j] = list.get(j);
		}
	}
}