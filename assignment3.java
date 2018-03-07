/* 
 * CS210 Assignment (3)
 * Zulai Zhang - zhangzulai@gmail.com
 * Student ID: 950684236
 * 2018.01.30 - Winter quarter
 * I use the while loop to run this, if the computer guesses a number is bigger or smaller than the correct one, the random
 will be changed. So next time computer will guess the correct one faster until it gets the right one. I even use a println
 to check my random if they would get changed.
 * This program writes about guessing game.
 */
package assignment3;

import java.util.*;

public class assignment3 {

	static int lowRandom = 0;
	static int highRandom = 100;

	public static void main(String[] args) {
		System.out.println("Player is thinking of a number between 0 and 100.");
		boolean play = true;
		Scanner console = new Scanner(System.in);

		console.nextInt();
		int answer;

		while (play) {
			//System.out.println("high:" + highRandom + ", low:" + lowRandom);

			Random rand = new Random();
			answer = rand.nextInt(1 + highRandom - lowRandom) + lowRandom;
			System.out.println("Computer guesses : " + answer);
			System.out.println("Player responds, this is (high, low, correct): ");
			String user = console.next();
			if (user.startsWith("l")) {
				lowRandom = answer + 1;
			} else if (user.startsWith("h")) {
				highRandom = answer - 1;
			} else if (user.startsWith("c")) {
				System.out.println("Computer says: Good game, Dave!");
				System.out.println("Play again?");

				String reply = console.next();
				if (reply.startsWith("Y") || reply.startsWith("y")) {
					System.out.println("Think another number between 0 and 100");
					play = true;
					console.nextInt();
					highRandom = 100;
					lowRandom = 0;

				} else if (reply.startsWith("N") || reply.startsWith("n")) {
					play = false;
					System.out.println("Thanks for playing!");

				}
console.close();
			}

		}

	}

}