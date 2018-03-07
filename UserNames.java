/* 
 * CS210 Assignment (6)
 * Zulai Zhang - zhangzulai@gmail.com
 * Student ID: 950684236
 * 2018.03.02 - Winter quarter
 * I use some while loop to check if the names that user input are correct or not, and find out each error
 * they have for each name and print out to tell the users they should input the names like that.After they
 * get the correct name, the new name will save to the user.txt.
 * This program Creates a new valid username and stores it into a file database. 
 */
package assignment6;

import java.util.*;
import java.io.*;

class user {
	String name;
}

public class UserNames {

	public static ArrayList<user> myArray = new ArrayList<>();

	// public static int howMany: myArray.size()
	public static void main(String[] args) throws FileNotFoundException {

		while (true) {

			Scanner console = new Scanner(System.in);
			Scanner input = new Scanner(new File("user.txt"));
			readFile(input);
			printNames();
			String newUserName = checkName(console);
			PrintStream out = new PrintStream("user.txt");
			writeName(newUserName, out);
		}
	}

	// this is the method for reading file, save inputs to arra, and count number of
	// lines
	public static void readFile(Scanner input) {

		myArray.clear();
		while (input.hasNext()) {
			user n = new user();
			n.name = input.next();
			myArray.add(n);
		}

	}
	
	// print the name
	public static void printNames() {
		System.out.println("User Database from \"users.txt\" ");
		for (int i = 0; i < myArray.size(); i++) {
			System.out.println(myArray.get(i).name);
		}
	}

	// check the input
	public static String checkName(Scanner console) {
		String tempName;
		boolean judge = false;
		String errorText = "Invaild name. ";
		while (true) {
			System.out.println("Create a new user:");
			tempName = console.next();// enter the name

			for (int i = 0; i < tempName.length(); i++) {
				if (!Character.isLetter(tempName.charAt(i))) {
					judge = true;
					break;
				} else {
					judge = false;
				}
			}
			// check the space
			if (tempName.contains(" ")) {
				errorText += "Name can¡¯t contain any space. ";
				judge = true;
			}
			// check the length
			if (tempName.length() < 4) {
				errorText += "Username must be at least 4 character. ";
				judge = true;
			}
			// check the length
			if (tempName.length() > 8) {
				errorText += "Username must be shorter than 8 character. ";
				judge = true;
			}

			// check whether the first character is number
			if (tempName.charAt(0) >= '0' && tempName.charAt(0) <= '9') {
				errorText += "Username cannot start with a number. ";
				judge = true;
			}
			// check whether this name is used or not
			if (nameCheck(tempName) == true) {
				errorText += "This username is already taken. ";
				judge = true;
			}
			// check wheher has special characters
			if (!validtempNameChars(tempName)) {
				errorText += "Cannot contain any special characters!";
				judge = true;
			}
			if (judge) {
				System.out.println(errorText);
				errorText = "Invaild name. ";
			} else {
				System.out.println("User " + tempName + " added to \"users.txt\" successfully! ");
				System.out.println();
				// print the name which user input
				return tempName;

			}
		}
	}

	public static boolean validtempNameChars(String tempName) {
		// tempName = tempName.toUpperCase();
		for (int i = 0; i < tempName.length(); i++) {
			int ch = Character.valueOf(tempName.charAt(i));
			if (ch >= 48 && ch <= 57)
				return true;

			if (ch >= 65 && ch <= 90)
				return true;

			if (ch >= 97 && ch <= 122)
				return true;

			if (ch == 32)
				return true;

			if ((ch < 48 || ch > 57) && (ch < 65 || ch > 90) && ch != 32) {
				return false;
			}
		}
		return false;
	}

	public static boolean nameCheck(String tempName) {
		for (int i = 0; i < myArray.size(); i++) {
			if (tempName.equalsIgnoreCase(myArray.get(i).name)) {
				// ignore the case
				return true;
			}
		}
		return false;
	}

	// write name
	public static void writeName(String newname, PrintStream out) {
		for (int i = 0; i < myArray.size(); i++) {
			out.println(myArray.get(i).name);
		}
		out.println(newname);
	}
}