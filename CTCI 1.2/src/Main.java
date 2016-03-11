
public class Main {

	public static void main(String[] args) {
		String string = "abcd";
		char[] charArray = string.toCharArray();
		System.out.print("Original char[]: ");
		System.out.println(charArray);
		reverse(charArray);
	}
	
	public static void reverse(char[] charArray) {
		int j = charArray.length-1;
		for(int i=0; i<charArray.length/2; i++) {
			j=j-i;
			
			char temp=charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
		}
		
		System.out.print("Reversed char[]: ");
		System.out.println(charArray);
	}

}
