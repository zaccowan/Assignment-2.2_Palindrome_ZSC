import java.util.Stack;

public class Palindrome {
	private String originalStr = "";
	private String trimmedStr = originalStr.replaceAll(" ", "");
	private Stack<Character> reverseString;
	private boolean isAPalindrome;
	
	Palindrome() {
		this.reverseString = new Stack<Character>();
		this.originalStr = "";
		this.isAPalindrome = false;
	}
	Palindrome(String str) {
		this.reverseString = new Stack<Character>();
		this.originalStr = str;
		this.isAPalindrome = false;
	}
	
	public static boolean checkIsPalindrome(String trimmedStr, Stack<Character> reverseString) {
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
				break;
			}
		}
	}

}
