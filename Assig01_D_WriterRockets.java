/* 
 * CS210 Assignment 01 (Methods - Rockets)
 * Zulai Zhang - zhangzulai@gmail.com
 * Student ID: 950684236
 * 2018.01.11 - Winter quarter
 * I use the String to build these rockets, and if I want to add another one I can easily do that. 
 * This program draws a picture of rockets.
 */
package assignment1bonus;

public class Assig01_D_WriterRockets {

	public static void main(String[] args) {
		drawCone();
		drawBox();
		drawLogo();
		drawBox();
		drawCone();
		}
		// TODO Auto-generated method stub}
	static String space =" ";
	
	public static void drawCone(){
		String cone1 ="   /\\   ";
		String cone2 ="  /  \\  ";
		String cone3 =" /    \\ ";
		String cone4 =" \\    / ";
		String cone5 ="  \\  /  ";
		String cone6 ="   \\/   ";
		System.out.println(cone1 + space + cone4);
		System.out.println(cone2 + space + cone5);
		System.out.println(cone3 + space + cone6);
	}
	public static void line(){
		String line ="+------+";
		System.out.println(line + space + line);
	}
	public static void side(){
		String side ="|      |";
		System.out.println(side + space + side);
	}
	
	public static void drawBox() {
		line();
		side();
		side();
		line();
		}
	public static void drawLogo() {
		String nine="| 9999 |";
		String six="| 6666 |";
		side();
		System.out.println(nine + space + six);
		side();
	}
	
}
