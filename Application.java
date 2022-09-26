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
		Palindrome pal = new Palindrome();
		String stringToTest = "";
		
		//Repeats user prompting until user decides to quit
		//User enters a string
		while ( !stringToTest.equalsIgnoreCase("Q") ) {
			System.out.println("Please enter a word to test if it is a palindrome. Enter \"Q\" to stop.");
			stringToTest = scan.nextLine();
			pal.setString(stringToTest);
			
			System.out.println("Word Entered:\t" + pal.getString() + "\nIs Palindrome:\t" + pal.isPalindrome());
		}//close while
		
		
		
	}//close main
}//close class
