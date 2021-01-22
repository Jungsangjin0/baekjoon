package baekjoon.nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baek3009 {

	//대칭되는 나머지 한 점 찾기 X Y
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr1 = br.readLine().split(" ");
		String[] arr2 = br.readLine().split(" ");
		String[] arr3 = br.readLine().split(" ");
		int x = 0;
		int y = 0;
		
		if(arr1[0].equals(arr2[0])) {
			x = Integer.parseInt(arr3[0]);
		}else if(arr2[0].equals(arr3[0])) {
			x = Integer.parseInt(arr1[0]);
		}else if(arr1[0].equals(arr3[0])) {
			x = Integer.parseInt(arr2[0]);
		}
		
		if(arr1[1].equals(arr2[1])) {
			y = Integer.parseInt(arr3[1]);
		}else if(arr2[1].equals(arr3[1])) {
			y = Integer.parseInt(arr1[1]);
		}else if(arr1[1].equals(arr3[1])) {
			y = Integer.parseInt(arr2[1]);
		}
		
		System.out.println(x + " " + y);
	}
}
