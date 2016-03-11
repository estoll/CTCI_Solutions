
public class Main {
	
	public static void main(String[] args) {
		String str = "aabccccaa";
		
		System.out.println(compressString(str));
	}
	
	public static String compressString(String str) {
		
		if(str.isEmpty()) {
			return null;
		}
		
		char[] charArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		char temp = charArray[0];
		int count = 1;
		for(int i=1; i<charArray.length; i++) {
			if(charArray[i]==temp) {
				count++;
			} else {
				sb.append(temp);
				sb.append(count);
				count = 1;
				temp = charArray[i];
			}
		}
		sb.append(temp);
		sb.append(count);
		
		if(sb.toString().length() >= str.length()) {
			return str;
		}
		return sb.toString();
	}
	

}
