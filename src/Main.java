import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {		
		String s = "+1234";
		boolean check = true;
        
        int value = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '-') {
                check = false;
            }else if(s.charAt(i) != '+') {
                value = value * 10 + (s.charAt(i) - 48);
            }
        }
	}	
}