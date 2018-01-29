/**
 * 
 */

/**
 * @author Jonathan Meredith
 *
 */
import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		System.out.println("Please Enter Your Name");
		Scanner keyboard = new Scanner (System.in);
		String name;
		name = keyboard.nextLine();
		keyboard.close();
		int length = name.length();
		System.out.println("Your name has " + length + " characters");
		System.out.println("Your name in all uppercase letters is " + name.toUpperCase());
		System.out.println("Your name in all lowercase letters is " + name.toLowerCase());
		System.out.println("The first letter in your name is " + name.charAt(0));
		System.out.println("The first letter in your name is " + name.charAt((length-1)));

	}

}
