public class Main {
	
	public static void main(String[] args) {
		String str = "baekjoon";
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("ch : " + ch);
			System.out.println(ch -'a');
			System.out.println((int)'a');
			System.out.println((int)ch);
		}
		
	}
}