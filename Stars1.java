/* 
 * CS210 Quiz3 (1)
 * Zulai Zhang - zhangzulai@gmail.com
 * Student ID: 950684236
 * 2018.01.17 - Winter quarter
 * I use loop to develop this, but I save howManyLines and stars under my main, so when I need to some change, I can easily change these two elements
 * to build up the new one.
 * This program writes about how to output stars in different lines.
 */
package Exercise3A;

public class Stars1 {

	public static void main(String[] args) {
		int howManyLines = 5;
		String s = "*";
		drawStar(howManyLines, s);
	}

	public static void drawStar(int howManyLines, String s) {
		for (int i = 1; i <= howManyLines; i++) {
			for (int k = 1; k <= i; k++) {
				System.out.print(s);
			}
			System.out.println();
		}
		// TODO Auto-generated method stub

	}

}
