
public class Main {
	
	public static void main(String[] args) {
		String str = "Some String yay      ";
		System.out.println(replace(str, 13));
		
		
	}
	
	public static String replace(String str, int trueSize) {
		
		char[] charArray = str.toCharArray();
		
		for(int i=0; i<charArray.length; i++) {
			if(charArray[i] ==  ' ') {
				charArray[i] = '%';
				charArray[i+1] = '2';
				charArray[i+2] = '0';
				
				char temp = charArra
				for(int j=i+3; j<charArray.length; j++) {
					char temp = charArray[j+1];
					charArray[j+1] = ;
				}
			}
		}
		
		return new String(charArray);
		
	}

}
