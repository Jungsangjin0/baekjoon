package baekjoon.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class test2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), ",");
		List<Integer> list = new ArrayList<Integer>();
		
		while(st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		int[] arr = new int[list.size()];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}
		
		StringBuilder sb = test(arr);
		
		System.out.println(sb);
	}
	
	

	public static StringBuilder test(int []arr) {
		int[] answer = {};
		StringBuilder sb = new StringBuilder();
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				list.add(arr[i]);
			}else {
				if(arr[i - 1] == arr[i]) {
					continue;
				}else {
					list.add(arr[i]);
				}
			}
		}
		//
		answer = new int[list.size()];
		for(int j = 0; j < answer.length; j++) {
			answer[j] = list.get(j);
		}
		//
		for(int i = 0; i < answer.length; i++) {
			if(i == 0) {
				sb.append("[").append(answer[i]).append(",");
			}else {
				if(i == answer.length -1) {
					sb.append(answer[i]).append("]");
				}else {
					sb.append(answer[i]).append(",");
				}
			}
		}
		
		return sb;
	}
}
