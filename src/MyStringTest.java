/*
 * Zachary Miller
 * Assignment 9.4
 * The purpose of this program is to create an instance of the string class and assign a literal value to it. Then print that value in reverse  
 * 25 Oct 2017
 * Bellevue University
 * MyStringTest.java
 */
import java.util.*;
public class MyStringTest {

	public static void main(String[] args) {
		
		String original = new String(getInput());
		String reverse = new String(reverseString(original));
		displayOutput(original,reverse);
	}
	
	private static String getInput()
	{
		System.out.println("Please enter a string: ");
		Scanner scan = new Scanner(System.in);
		String input=scan.next();
		scan.close();
		return input;
	}
	
	private static String reverseString(String original)
	{
		int length = original.length();
		String reverse = new String();
	    for ( int i = length - 1; i >= 0; i-- )
	    	reverse = reverse + original.charAt(i);
	    return reverse;
	}
	
	private static void displayOutput(String original, String reverse) 
	{
		System.out.println("The original string was: "+original);
		System.out.println("The string reversed is: "+reverse);
	}


}
