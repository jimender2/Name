/**
 Jonathan Meredith
 This program is for my CS 121 Class. This program is the third assignment of the class.
 In this program I have the user enter their name and it outputs a few different piece of
 information based on characteristics in the users name (e.g. length of the name, displays 
 the name in all CAPS and all lowercase, and the first and last letter of the name).
 *
 */

import java.util.Scanner;
public class Name
{
	public static void main(String[] args)
	{
		//Have user input their name into a variable called name
		System.out.println("Please Enter Your Name:");
		Scanner keyboard = new Scanner (System.in);
		String name;
		name = keyboard.nextLine();
		keyboard.close();
		int length = name.length();
		
		//Print name and length of name
		System.out.println("Your name is " + name);
		System.out.println("Your name has " + length + " characters");
		
		//Convert to upper and lower case
		System.out.println("Your name in all uppercase letters is " + name.toUpperCase());
		System.out.println("Your name in all lowercase letters is " + name.toLowerCase());
		
		//Print the first and last letter
		System.out.println("The first letter in your name is " + name.charAt(0));
		System.out.println("The first letter in your name is " + name.charAt((length-1)));
	}
}
