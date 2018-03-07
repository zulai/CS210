package exercise5;
import java.io.*;
import java.util.*;
public class exercise5 {

	public static void main(String[] args) 
		throws FileNotFoundException{
		Scanner input = new Scanner(new File("student.txt"));
	while (input.hasNextInt()) {
		String id = input.next();
		String name = input.next();
		String gender = input.next();
		//int age = input.nextInt();
		System.out.println(id + " " + name + " " + gender);
	}
	input.close();
		// TODO Auto-generated method stub

	}

}
