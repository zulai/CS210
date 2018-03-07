package assignment7;

import java.util.*;
import java.io.*;

public class assignment7 {

	public static void main(String[] args) throws FileNotFoundException {
		int[] id = new int[14];
		String[] name = new String[14];
		String[] gender = new String[14];
		int[] age = new int[14];
		double[] score = new double[14];
		Scanner input = new Scanner(new File("studentGPA.txt"));

		int index = -1;
		while (input.hasNext()) {
			index++;
			id[index] = input.nextInt();
			name[index] = input.next();
			gender[index] = input.next();
			age[index] = input.nextInt();
			score[index] = input.nextDouble();
		}
		double sumScore = 0;
		for (int i = 0; i <= index; i++) {

			sumScore = sumScore + score[i];
		}
		System.out.println("Average GPA of all students is " + sumScore / id[index]);

		double sumScoreM = 0;
		double idM = 0;
		for (int i = 0; i <= index; i++) {
			if (gender[i].startsWith("m")) {
				idM++;
				sumScoreM = sumScoreM + score[i];
			}
		}
		System.out.println("Average GPA of male students is " + sumScoreM / idM);

		double sumScoreF = 0;
		double idF = 0;	
		for (int i = 0; i <= index; i++) {
			if (gender[i].startsWith("f")) {
				idF++;
				sumScoreF = sumScoreF + score[i];
			}
		}
		System.out.println("Average GPA of female students is " + sumScoreF / idF);
		input.close();
	}

}
