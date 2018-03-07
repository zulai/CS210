package zasd;

import java.util.Scanner;

public class hahahah {
	static double area1;
	static double area2;
	static String name1;
	static String name2;

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		getInfor1(console);
		getInfor2(console);
		printResult();
	}

	public static void getInfor1(Scanner console) {
		System.out.println("Information for figure 1:");
		System.out.println("Type 1 ) rectangle 2) triangle 3) circle");
		typeChoice(console, 1);
	}

	public static void getInfor2(Scanner console) {
		System.out.println("Information for figure 2:");
		System.out.println("Type 1 ) rectangle 2) triangle 3) circle");
		typeChoice(console, 2);
	}

	public static void typeChoice(Scanner console, int number) {
		Double choice = console.nextDouble();
		Double area = 0.0;
		String name = "";
		if (choice == 1) {
			area = areaRectangle();
			name = "Rectangle";
		} else if (choice == 2) {
			area = areaTriangle();
			name = "Triangle";
		} else if (choice == 3) {
			area = areaCircle();
			name = "Circle";
		} else {
			System.out.println("Plaese type in one of the following name");
			typeChoice(console, number);
		}
		if (number == 1) {
			area1 = area;
			name1 = name;
		} else {
			area2 = area;
			name2 = name;
		}
	}

	public static double areaRectangle() {
		Scanner lenth = new Scanner(System.in);
		System.out.println("Type the width of rectangle here");
		Double width = lenth.nextDouble();
		System.out.println("Type the height of rectangle here");
		double height = lenth.nextDouble();
		double result = width * height;
		lenth.close();
		return result;
	}

	public static double areaTriangle() {
		Scanner lenth = new Scanner(System.in);
		System.out.println("Type the width of trianle here");
		Double width = lenth.nextDouble();
		System.out.println("Type the height of triangle here");
		double height = lenth.nextDouble();
		double result = width * height / 2.0;
		lenth.close();
		return result;
	}

	public static double areaCircle() {
		Scanner lenth = new Scanner(System.in);
		System.out.println("Type the radius of circle here");
		double radius = lenth.nextDouble();
		double result = radius * radius * Math.PI;
		lenth.close();
		return result;
		
		// TODO Auto-generated method stub

	}

	public static void printResult() {
		System.out.println(name1 + " " + area1);
		System.out.println(name2 + " " + area2);
		if (area1 > area2) {
			System.out.println(name1 + " seems bigger than " + name2);
		} else if (area1 < area2) {
			System.out.println(name2 + " seems bigger than " + name1);
		} else {
			System.out.println(name1 + "is equal to " + name2);
		}

	}
}


