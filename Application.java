import java.util.Stack;
import java.util.Scanner;


/**
 * Application to test if a user entered string is a palindrome.
 * @author Zac Cowan
 * @version 9/22/2022
 * Fall/2022
 */
public class Application {

	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String stringToTest = "";
		
		//Repeats user prompting until user decides to quit
		//User enters a string
		while ( !stringToTest.equalsIgnoreCase("Q") ) {
			System.out.println("Please enter a word to test if it is a palindrome. Enter \"Q\" to stop.");
			stringToTest = scan.nextLine();
			
			System.out.println("Word Entered:\t" + stringToTest + "\nIs Palindrome:\t" + isPalindromeNoStack(stringToTest));
		}
		
		
		
	}
	
	
	/**
	 * Method to test if a string is a palindrome using a Stack.
	 * @param str String to test
	 * @return True if string is a palindrome
	 */
	public static boolean isPalindrome(String str) {
		//Removes whitespace from the string
		String trimmedWord = str.replaceAll(" ", "");
		
		//Stack used to store the string characters as a LIFO (last in first out) data structure
		Stack<Character> reverseString = new Stack<Character>();
		
		//Returns true if two compared values are always equal
		//Returns false if, at some point, the two compared values are not equal
		boolean isPalindrome = true;
		
		//Adds string characters to a stack
		for( int index = 0 ; index < trimmedWord.length() ; index++ ) {
			reverseString.push(trimmedWord.charAt(index));
		}
		
		//Compares first character (of string) to last character (top of stack) then pops the stack and increases the index.
		//Doing this makes the compared values start at beginning and end and work in the opposite direction until all characters have been checked
		for( int index = 0 ; index < trimmedWord.length() ; index++) {
			char tempEndChar = reverseString.pop();
			char tempStartChar = trimmedWord.charAt(index);
			if( tempStartChar != tempEndChar ) {
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
	}
	
	
	/**
	 * Method to test if a string is a palindrome.
	 * @param str String to test
	 * @return True if string is a palindrome
	 */
	public static boolean isPalindromeNoStack(String str) {
		boolean isPalindrome = true;
		
		String trimmedWord = str.replaceAll(" ", "");
		
		for( int index = 0 ; index < trimmedWord.length() - 1 ; index++ ) {
			if( trimmedWord.charAt(index) != trimmedWord.charAt(trimmedWord.length() -1 - index ) ) {
				isPalindrome = false;
				break;
			}
		}
		
		return isPalindrome;
	}
}
