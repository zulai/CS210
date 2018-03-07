package exercise5;
import java.io.*;
import java.util.*;
public class exercise5_2 {

	public static void main(String[] args)  throws FileNotFoundException{
		Scanner input = new Scanner(new File("student2.txt"));
		while (input.hasNextInt()) {
			String id = input.next();	
			String name = input.next();
			String gender = input.next();
			int age = input.nextInt();
			System.out.println(id + " " + name + " " + gender + " " + age);
			avgAge(gender, age);}
	}
		public static void avgAge(String gender, double age) {
			if(gender.startsWith("m")) {
				double sum = age;
				
			}
			
		}
		// TODO Auto-generated method stub

	}


