package MakeUp;

import java.awt.Color;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.*;

public class MakeUp2 extends JFrame {
	
	Random rand = new Random();
	int[] numbers = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };{
	for (int j = 1; j <= 1000; j++) {
		int number = rand.nextInt(10);
		if (number == 0) {numbers[0]++;}
		if (number == 1) {numbers[1]++;}
		if (number == 2) {numbers[2]++;}
		if (number == 3) {numbers[3]++;}
		if (number == 4) {numbers[4]++;}
		if (number == 5) {numbers[5]++;}
		if (number == 6) {numbers[6]++;}
		if (number == 7) {numbers[7]++;}
		if (number == 8) {numbers[8]++;}
		if (number == 9) {numbers[9]++;}
	}	
	}



	public MakeUp2() {
		super("Make Up 2");
		setBounds(100, 100, 1500, 600); // at your monitor
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {
		g.clearRect(0, 0, 1500, 600);
//		g.setColor(Color.RED);
//		g.drawString("Hello", 100, 400);

		g.setColor(Color.GREEN);
		for (int i = 0; i <= 9; i++) {
			g.fillRect(30 + 140 * i, 400-numbers[i], 70, numbers[i]);
		}
		g.setColor(Color.RED);
		for (int i = 0; i <= 9; i++) {
		g.drawString(""+i, 30+140*i, 408);
		}
		g.setColor(Color.BLACK);
		for (int i = 0; i <= 9; i++) {
		g.drawString(""+numbers[i], 30+140*i, 398-numbers[i]);
		}
		
	}	

	public static void main(String[] args) {
		
		new MakeUp2();
	}
}