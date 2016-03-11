
public class Main {

	public static void main(String[] args) {
		String s = "abcd";
		
		if(isUnique(s)) {
			System.out.println("String has all unique characters");
		} else {
			System.out.println("String doesn't have all unique characters");
		}
	}
	
	public static boolean isUnique(String s) {
		
		for(int i=0; i<s.length(); i++) {
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
