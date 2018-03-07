/* 
 * CS210 Quiz3 (4)
 * Zulai Zhang - zhangzulai@gmail.com
 * Student ID: 950684236
 * 2018.01.22 - Winter quarter
 * I use the console that sepearates between two sentences, so when the users finished the first
 * step, the instruction about the second step would come, and do this over and over again until
 * it get finished.
 * This program writes about users can use any types of strings, and they can control how many
 * lines and how many strings in one line.  
 */
package zasd;

import java.util.*;

public class nihao {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("How many lines£¿");
		int howManyLines = console.nextInt();

		System.out.print("How many strings in a line?");
		int zzl = console.nextInt();

		System.out.print("What strings?");
		String s = console.next();

		drawStar(howManyLines, zzl, s);
		console.close();
	}

	public static void drawStar(int howManyLines, int zzl, String s) {

		for (int i = 1; i <= howManyLines; i++) {

			for (int k = 1; k <= zzl; k++) {
				System.out.print(s);
			}
			System.out.println();

			// TODO Auto-generated method stub

		}
	}
}
