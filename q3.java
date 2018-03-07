/* 
 * CS210 Exercise2 (q3)
 * Zulai Zhang - zhangzulai@gmail.com
 * Student ID: 950684236
 * 2018.01.12 - Winter quarter
 * I use i+=2 since it means i=i+2, so the stars will increase 2 automatically. 
 * This program writes about how to write different number in the different lines..
 */
package q3;

public class q3 {

	public static void main(String[] args) {
		for (int i=1; i<=10; i+=2 ) {
			
			for (int k=1; k<=i; k++) { 
			System.out.print("*");
		}
		System.out.println();// TODO Auto-generated method stub

	}
	}	
}