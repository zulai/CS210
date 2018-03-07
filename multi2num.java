/* 
 * CS210 Quiz3 (3)
 * Zulai Zhang - zhangzulai@gmail.com
 * Student ID: 950684236
 * 2018.01.17 - Winter quarter
 * I use parentheses to put i+1 as one, so my computer will not count that as they are i1, instead, it is (i+1)
 * This program writes about how to output stars in different equations. 
 */
package Exercise3C;

public class multi2num {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			multi(i, i + 1);
		}
		// TODO Auto-generated method stub

	}

	public static void multi(int i, int j) {

		System.out.println(i + "*" + (i + 1) + "=" + i * (i + 1));
	}
}
