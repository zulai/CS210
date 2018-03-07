package MakeUp;

import java.io.*;
import java.util.*;

public class MakeUp1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(System.in);
		String[] name = new String[14];
		String[] place = new String[14];
		System.out.println("What's your file name?");
		String answer = console.next();
		console.close();
		// Scanner input = new Scanner(new File("home.txt"));
		Scanner input = new Scanner(new File(answer));
		int index = 0;
		while (input.hasNext()) {
			name[index] = input.next();
			place[index] = input.next();
			index++;
		}
		int Seattle = 0;
		for (int i = 0; i < index; i++) {
			if (place[i].equals("Seattle")) {
				Seattle++;
			}
		}
		System.out.println("Seattle students:" + Seattle);
		for (int i = 0; i < index; i++) {
			if (place[i].equals("Seattle")) {
				System.out.println(name[i]);
			}
		}
		System.out.println("");	
		int Yakima = 0;
		for (int i = 0; i < index; i++) {
			if (place[i].equals("Yakima")) {
				Yakima++;
			}
		}
		System.out.println("Yakima students:" + Yakima);
		for (int i = 0; i < index; i++) {
			if (place[i].equals("Yakima")) {
				System.out.println(name[i]);
			}
		}
		System.out.println("");
		int Everett = 0;
		for (int i = 0; i < index; i++) {
			if (place[i].equals("Everett")) {
				Everett++;
			}
		}
		System.out.println("Everett students:" + Everett);
		for (int i = 0; i < index; i++) {
			if (place[i].equals("Everett")) {
				System.out.println(name[i]);
			}
		}
		System.out.println("");
		int Spokane = 0;
		for (int i = 0; i < index; i++) {
			if (place[i].equals("Spokane")) {
				Spokane++;
			}
		}
		System.out.println("Spokane students:" + Spokane);
		for (int i = 0; i < index; i++) {
			if (place[i].equals("Spokane")) {
				System.out.println(name[i]);
			}
		}
		System.out.println("");
		int LaPush = 0;
		for (int i = 0; i < index; i++) {
			if (place[i].equals("LaPush")) {
				LaPush++;
			}
		}
		System.out.println("LaPush students:" + LaPush);
		for (int i = 0; i < index; i++) {
			if (place[i].equals("LaPush")) {
				System.out.println(name[i]);
			}
		}
		input.close();
	}
}
