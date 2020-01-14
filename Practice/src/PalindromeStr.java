// Palindrome is a string which is samefrom backward and forward
public class PalindromeStr {

	public static void main(String[] args) {
	
		String str = "abccba";
		int j = str.length() - 1;
		int i = 0;
		for ( i = 0; i < j ; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				System.out.println("Not Palindrome");
				break;
			}			
		}
		if (i >= j) {
			System.out.println("Is Palindrome");
		}		

	}
}
