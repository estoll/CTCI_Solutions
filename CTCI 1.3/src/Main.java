import java.util.ArrayList;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		String str1 = "Some string 1";
		String str2 = "Some string 1";
		
		if(isPermutation(str1, str2)) {
			System.out.println("Is a permutation");
		} else {
			System.out.println("Not a permutation");
		}

	}
	
	public static boolean isPermutation(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
	}

}
