//1. how to draw line, oval, rectangle and string
//2. Random generator
//3. (REPEAT) drawing using Random generator
//3-1 random size
//3-2 random color
//4. background reset
//5. method call method
//6. moving object
//6-1 moving object(hit & back)

//* CS210 Assignment 04 
// * Zulai Zhang - zhangzulai@gmail.com
// * Student ID: 950684236
// * 2018.02.09 - Winter quarter
// * I don't know how to use the correct way to solve it, I tried my best to solve it by myself since I think it was 
//   night. Can you send me a solution to solve the problem when two objects are meeting together, and they run back.
// * This program draws supper balls.
package assignment4;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.*;

public class assignment4 extends JFrame {

	static int width = 800;
	static int height = 600;
	static int R, G, B;
	static int R2, G2, B2;
	static int R3, G3, B3;
	static int x1, y1, size1, speedX1, speedY1;
	static int x2, y2, size2, speedX2, speedY2;
	static int x3, y3, size3, speedX3, speedY3;
	static int x4, y4, starSize1, speedX4, speedY4;
	static int x5, y5, starSize2, speedX5, speedY5;
	static Color color1;
	static Color color2;
	static Color color3;
	static Color color4;
	static Color color5;

	public assignment4() {
		super("Super Ball");
		setBounds(100, 100, width, height); // at your monitor
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void createBall() {
		Random rand = new Random(); // for random number generator
		R = rand.nextInt(256);
		G = rand.nextInt(256);
		B = rand.nextInt(256);
		color1 = new Color(R, G, B);

		x1 = rand.nextInt(width);
		y1 = rand.nextInt(height);
		size1 = rand.nextInt(90) + 20;
		speedX1 = rand.nextInt(5) + 1;
		speedY1 = rand.nextInt(5) + 1;
		Random rand2 = new Random(); // for random number generator
		R2 = rand2.nextInt(256);
		G2 = rand2.nextInt(256);
		B2 = rand2.nextInt(256);
		color2 = new Color(R2, G2, B2);
		x2 = rand2.nextInt(width);
		y2 = rand2.nextInt(height);
		size2 = rand2.nextInt(90) + 20;
		speedX2 = rand2.nextInt(5) + 1;
		speedY2 = rand2.nextInt(5) + 1;

		Random rand3 = new Random();
		R3 = rand3.nextInt(256);
		G3 = rand3.nextInt(256);
		B3 = rand3.nextInt(256);
		color3 = new Color(R3, G3, B3);
		x3 = rand3.nextInt(width);
		y3 = rand3.nextInt(height);
		size3 = rand3.nextInt(90) + 20;
		speedX3 = rand3.nextInt(5) + 1;
		speedY3 = rand3.nextInt(5) + 1;

		Random rand4 = new Random();
		color4 = new Color(rand4.nextInt(256), rand4.nextInt(256), rand4.nextInt(256));
		x4 = rand4.nextInt(width);
		y4 = rand4.nextInt(height);
		starSize1 = rand4.nextInt(90) + 20;
		speedX4 = rand4.nextInt(5) + 1;
		speedY4 = rand4.nextInt(5) + 1;

		Random rand5 = new Random();
		color5 = new Color(rand5.nextInt(256), rand5.nextInt(256), rand5.nextInt(256));
		x5 = rand5.nextInt(width);
		y5 = rand5.nextInt(height);
		starSize2 = rand5.nextInt(90) + 20;
		speedX5 = rand5.nextInt(5) + 1;
		speedY5 = rand5.nextInt(5) + 1;
	}

	public void paint(Graphics g) {

		g.setColor(Color.WHITE);
		g.fillRect(0, 0, getWidth(), getHeight());

		g.setColor(color1);
		x1 += speedX1;
		if (x1 + size1 > width || x1 < 0) {
			speedX1 = speedX1 * -1;
		}

		y1 += speedY1;
		if (y1 + size1 > height || y1 < 0) {
			speedY1 = speedY1 * -1;
		} // collision - bottom

		if (Math.abs((x1 + size1 / 2) - (x2 + size2 / 2)) < (size1 + size2) / 2
				&& Math.abs((y1 + size1 / 2) - (y2 + size2 / 2)) < (size1 + size2) / 2) {
			speedX1 = speedX1 * -1;
			speedX2 = speedX2 * -1;
			speedY1 = speedY1 * -1;
			speedY2 = speedY2 * -1;
			// collision - right wall
		}
		if (Math.abs((x1 + size1 / 2) - (x3 + size3 / 2)) < (size1 + size3) / 2
				&& Math.abs((y1 + size1 / 2) - (y3 + size3 / 2)) < (size1 + size3) / 2) {
			speedX1 = speedX1 * -1;
			speedX3 = speedX3 * -1;
			speedY3 = speedY3 * -1;
			speedY1 = speedY1 * -1;
		}

		g.fillOval(x1, y1, size1, size1);

		g.setColor(color2);
		x2 += speedX2;
		if (x2 + size2 > width || x2 < 0) {
			speedX2 = speedX2 * -1;
		}

		y2 += speedY2;
		if (y2 + size2 > height || y2 < 0) {
			speedY2 = speedY2 * -1;
		}
		if (Math.abs((x2 + size2 / 2) - (x3 + size3 / 2)) < (size2 + size3) / 2
				&& Math.abs((y2 + size2 / 2) - (y3 + size3 / 2)) < (size2 + size3) / 2) {
			speedX2 = speedX2 * -1;
			speedX3 = speedX3 * -1;
			speedY3 = speedY3 * -1;
			speedY2 = speedY2 * -1;
		}
		if (Math.abs((x1 + size1 / 2) - (x4 + starSize1 / 2)) < (size1 + starSize1) / 2
				&& Math.abs((y1 + size1 / 2) - (y4 + starSize1 / 2)) < (size1 + starSize1) / 2) {
			speedX1 = speedX1 * -1;
			speedX4 = speedX4 * -1;
			speedY4 = speedY4 * -1;
			speedY1 = speedY1 * -1;
		}
		if (Math.abs((x1 + size1 / 2) - (x5 + starSize2 / 2)) < (size1 + starSize2) / 2
				&& Math.abs((y1 + size1 / 2) - (y5 + starSize2 / 2)) < (size1 + starSize2) / 2) {
			speedX1 = speedX1 * -1;
			speedX5 = speedX5 * -1;
			speedY5 = speedY5 * -1;
			speedY1 = speedY1 * -1;
		}
		if (Math.abs((x2 + size2 / 2) - (x5 + starSize2 / 2)) < (size2 + starSize2) / 2
				&& Math.abs((y2 + size2 / 2) - (y5 + starSize2 / 2)) < (size2 + starSize2) / 2) {
			speedX2 = speedX2 * -1;
			speedX5 = speedX5 * -1;
			speedY5 = speedY5 * -1;
			speedY2 = speedY2 * -1;
		}
		if (Math.abs((x3 + size3 / 2) - (x5 + starSize2 / 2)) < (size3 + starSize2) / 2
				&& Math.abs((y3 + size3 / 2) - (y5 + starSize2 / 2)) < (size3 + starSize2) / 2) {
			speedX3 = speedX3 * -1;
			speedX5 = speedX5 * -1;
			speedY5 = speedY5 * -1;
			speedY3 = speedY3 * -1;
		}
		if (Math.abs((x2 + size2 / 2) - (x4 + starSize1 / 2)) < (size2 + starSize1) / 2
				&& Math.abs((y2 + size2 / 2) - (y4 + starSize1 / 2)) < (size2 + starSize1) / 2) {
			speedX2 = speedX2 * -1;
			speedX4 = speedX4 * -1;
			speedY4 = speedY4 * -1;
			speedY2 = speedY2 * -1;
		}
		if (Math.abs((x3 + size3 / 2) - (x4 + starSize1 / 2)) < (size3 + starSize1) / 2
				&& Math.abs((y3 + size3 / 2) - (y4 + starSize1 / 2)) < (size3 + starSize1) / 2) {
			speedX3 = speedX3 * -1;
			speedX4 = speedX4 * -1;
			speedY4 = speedY4 * -1;
			speedY3 = speedY3 * -1;
		}
		if (Math.abs((x4 + starSize1 / 2) - (x5 + starSize2 / 2)) < (starSize2 + starSize1) / 2
				&& Math.abs((y4 + starSize1 / 2) - (y5 + starSize2 / 2)) < (starSize2 + starSize1) / 2) {
			speedX5 = speedX5 * -1;
			speedX4 = speedX4 * -1;
			speedY4 = speedY4 * -1;
			speedY5 = speedY5 * -1;
		}
		g.fillOval(x2, y2, size2, size2);

		g.setColor(color3);
		x3 += speedX3;
		if (x3 + size3 > width || x3 < 0) {
			speedX3 = speedX3 * -1;
		}

		y3 += speedY3;
		if (y3 + size3 > height || y3 < 0) {
			speedY3 = speedY3 * -1;
		}

		g.fillOval(x3, y3, size3, size3);

		// Star

		g.setColor(color4);

		int[] xCoords = new int[10];
		int[] yCoords = new int[10];
		int ang = 90 - 36;
		double rad;
		int size = starSize1;
		double PI = 3.14159;

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				rad = size * 0.38;
			else
				rad = size;
			xCoords[i] += (int) (rad * Math.cos(PI * ang / 180.0));
			yCoords[i] -= (int) (rad * Math.sin(PI * ang / 180.0));
			ang += 36;
			xCoords[i] += x4;
			yCoords[i] += y4;
		}
		x4 += speedX4;
		if (x4 + starSize1 > width || x4 - starSize1 < 0) {
			speedX4 = speedX4 * -1;
		}

		y4 += speedY4;
		if (y4 + starSize1 > height || y4 - starSize1 < 0) {
			speedY4 = speedY4 * -1;
		}
		g.fillPolygon(xCoords, yCoords, 10);

		g.setColor(color5);

		int[] xCoords1 = new int[10];
		int[] yCoords1 = new int[10];
		int ang1 = 90 - 36;
		double rad1;
		double PI1 = 3.14159;

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				rad1 = size1 * 0.38;
			else
				rad1 = size1;
			xCoords1[i] += (int) (rad1 * Math.cos(PI1 * ang1 / 180.0));
			yCoords1[i] -= (int) (rad1 * Math.sin(PI1 * ang1 / 180.0));
			ang1 += 36;
			xCoords1[i] += x5;
			yCoords1[i] += y5;
		}
		x5 += speedX5;
		if (x5 + starSize2 > width || x5 - starSize2 < 0) {
			speedX5 = speedX5 * -1;
		}

		y5 += speedY5;
		if (y5 + starSize2 > height || y5 - starSize2 < 0) {
			speedY5 = speedY5 * -1;
		}
		g.fillPolygon(xCoords1, yCoords1, 10);
		// end of star

		try {
			Thread.sleep(10);
		} catch (Exception exc) {
		}

		repaint();
	}

	public static void main(String[] args) {
		createBall();
		new assignment4();
	}
}