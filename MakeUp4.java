package MakeUp;

import java.util.*;

public class MakeUp4 {

	static String[] planets = new String[] { "Mercury ", "Venus ", "Earth ", "Mars ", "Jupiter ", "Saturn ", "Uranus ",
			"Neptune ", "Pluto ", "exit" };
	static int number[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
	static double[] distance = new double[] { 0.387, 0.723, 1.000, 1.524, 5.203, 9.523, 19.208, 30.087, 39, 746, 0 };

	public static void main(String[] args) {

		boolean play = true;
		boolean play1 = true;
		boolean play2 = true;
		Scanner console = new Scanner(System.in);
		// System.out.println("");
		while (play) {
			for (int i = 0; i <= 9; i++) {
				System.out.print(number[i] + "." + planets[i]);
			}
			System.out.println("");
			System.out.println("**************************************");
			System.out.println("Where are you now?");
			int answer = console.nextInt();
			if (answer > 9 || answer < 0) {
				System.out.println("Wrong number!! Select 1~9");
				System.out.println("");
				play = true;
			} else if (answer == 0) {
				System.out.println("Bye!!");
				play = false;
			} else {
				System.out.println("Select first Planet:");
				int reply1 = console.nextInt();
				while (play1) {
					if (reply1 == answer) {
						System.out.println("You cannot select the same planet. Please select another number.");
						reply1 = console.nextInt();
						play1 = true;
					} else if (reply1 == 0) {
						System.out.println("Bye!!");
						play = false;
					} else if (reply1 > 9 || reply1 < 0) {
						System.out.println("Wrong number!! Select 1~9");
						reply1 = console.nextInt();
						play1 = true;
					} 
				}
				System.out.println("Select second Planet:");
				int reply2 = console.nextInt();
				while (play2) {
					if (reply2 == answer || reply2 == reply1) {
						System.out.println("You cannot select the same planet. Please select another number.");
						reply2 = console.nextInt();
						play2 = true;
					} else if (reply2 == 0) {
						play = false;
						System.out.println("Bye!!");
					} else if (reply2 > 9 || reply2 < 0) {
						System.out.println("Wrong number!! Select 1~9");
						reply2 = console.nextInt();
						play2 = true;
					} else {
						play2 = false;
					}
				}
				for (int i = 0; i <= 9; i++) {
					if (number[i] == answer) {
						double distance1 = Math.abs((distance[i] - distance[reply1 - 1]));
						double distance2 = Math.abs((distance[i] - distance[reply2 - 1]));
						System.out.println(
								planets[reply1 - 1] + " distance from " + planets[i] + " = " + distance1 + "AU");
						System.out.println(
								planets[reply2 - 1] + " distance from " + planets[i] + " = " + distance2 + "AU");
						if (distance1 > distance2) {
							System.out.println(planets[reply1 - 1] + " seems to be closer than " + planets[reply2 - 1]);
						} else {
							System.out.println(planets[reply2 - 1] + " seems to be closer than " + planets[reply1 - 1]);
						}
						System.out.println("");

					}
				}

			}
		}
		console.close();
	}
	
}