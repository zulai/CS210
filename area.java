/* 
 * CS210 Quiz3 (4)
 * Zulai Zhang - zhangzulai@gmail.com
 * Student ID: 950684236
 * 2018.01.17 - Winter quarter
 * I used to put 3.14 in front of my two radius, but I get lots of decimal numbers. Somehow
 * I move 3.14 behind the radius, it gets only two decimal numbers.
 * This program writes about the areas of triangle and circle with known numbers. 
 */
package Exercise3D;

public class area {

	public static void main(String[] args) {
		double height = 5.5;
		double base = 10.0;
		tri(height, base);
		double radius = 3.0;
		circle(radius);
	}

	public static void tri(double height, double base) {
		System.out.println("area of triangle =" + height * base * 0.5);
	}

	public static void circle(double radius) {
		System.out.println("area of circle =" + radius * radius * 3.14);
	}

	// TODO Auto-generated method stub

}
