package assignment5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//* CS210 Assignment 05 
//* Zulai Zhang - zhangzulai@gmail.com
//* Student ID: 950684236
//* 2018.02.19 - Winter quarter
//* I use the map to draw my hometown Ninghai, B stands for band, R stands for restraunt, V stands for village. I find the 
//  center for Ninghai at first, and then find the data information about all the locations. After I put the infor in the 
//  text, computer will read them and then give me the map which I want.
//* This program draws a map about Ninghai.
public class myMap {
	static String title;
	static String mapCenterlati;
	static String mapCenterlongi;
	static int zoom;
	static int width;
	static int height;
	static int scale;
	static String type;
	static String marks = "";

	static void bigData() throws FileNotFoundException {

		// map initial info
		title = "My home town Ninghai";
		width = 800;
		height = 600;
		mapCenterlati = "29.294459"; // Ninghai, map center
		mapCenterlongi = "121.436046";
		zoom = 13;
		scale = 1;
		type = "roadmap"; // roadmap, satellite, hybrid, terrain
		Scanner input = new Scanner(new File("location.txt"));
		while (input.hasNextInt()) {
			String id = input.next();
			String mapCenterlati = input.next();
			String mapCenterlongi = input.next();
			String markColor = "";
			String label = "";
			if (id.equals("1")) {
				markColor = "red";
				label = "B";
			}
			if (id.equals("2")) {
				markColor = "blue";
				label = "R";
			}
			if (id.equals("3")) {
				markColor = "green";
				label = "V";
			}

			// mark 1
			// marks = "&markers=color:red%7Clabel:S%7C47.610378,-122.200676";
			// mark 2
			marks += "&markers=color:" + markColor + "%7Clabel:" + label + "%7C" + mapCenterlati + "," + mapCenterlongi;
		}
		input.close();
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {

		{
			bigData();
			new Map210(title, mapCenterlati, mapCenterlongi, zoom, width, height, scale, type, marks);

		}

	}
}