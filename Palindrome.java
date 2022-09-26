import java.util.Stack;

/**
 * Application to store a Palindrome and provide methods to test stored value.
 * @author Zac Cowan
 * @version 9/22/2022
 * Fall/2022
 */
public class Palindrome {
	private String originalStr = "";
	private Stack<Character> reverseString;
	
	Palindrome() {
		reverseString = new Stack<Character>();
		setString("");
	}
	Palindrome(String str) {
		reverseString = new Stack<Character>();
		setString(str);
	}

	
	/**
	 * @param str String to store in Palindrome Object
	 */
	public void setString(String str) {
		this.originalStr = str;
	}
	
	/**
	 * @return String stored in Palindrome Object
	 */
	public String getString() {
		return originalStr;
	}
	
	
	/**
	 * Test if string stored in Palindrome object is a palindrome.
	 * @return True if string stored is a palindrome
	 */
	public boolean isPalindrome() {
		boolean isPalindrome = true;
		String trimmedStr = originalStr.replaceAll(" ", "");
		
		//Adds string characters to a stack
		for( int index = 0 ; index < trimmedStr.length() ; index++ ) {
			reverseString.push(trimmedStr.charAt(index));
		}
		
		//Compares first character (of string) to last character (top of stack) then pops the stack and increases the index.
		//Doing this makes the compared values start at beginning and end and work in the opposite direction until all characters have been checked
		for( int index = 0 ; index < trimmedStr.length() ; index++) {
			char tempEndChar = reverseString.pop();
			char tempStartChar = trimmedStr.charAt(index);
			if( tempStartChar != tempEndChar ) {
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
	}
	
	
	
	
	

}
