package Assignment8;

import java.io.*;
import java.util.*;

class student {
	String id;
	String name;
	int age;
}

public class try1 {
	public static ArrayList<student> userList = new ArrayList<>();

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("student.txt"));
		while (input.hasNext()) {
			student s = new student();
			s.id = input.next();
			s.name = input.next();
			s.age = input.nextInt();
			userList.add(s);
		}
		System.out.println("== User List==");
		for (int i = 0; i < userList.size(); i++) {
			System.out.println(userList.get(i).id + " " + userList.get(i).name + " " + userList.get(i).age);
		}

	}

}
