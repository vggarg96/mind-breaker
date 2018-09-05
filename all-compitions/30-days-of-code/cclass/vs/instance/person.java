package cclass.vs.instance;

import java.io.*;
import java.util.*;

public class person {
	private int age;

	// public Person(int initialAge) {
	// Add some more code to run some checks on initialAge
	// }

	// public void amIOld() {
	// Write code determining if this person's age is old and print the correct
	// statement:
	// System.out.println(/*Insert correct print statement here*/);
	// }

	// public void yearPasses() {
	// Increment this person's age.
	// }
	int x;

	person(int age) {
		if (age < 0) {
			System.out.println("Age is not valid, setting age to 0.");
			this.x = 0;
		} else {
			this.x = age;
		}
	}

	void amIOld() {
		if (x < 13)
			System.out.println("You are young.");
		else if ((x >= 13) && (x < 18))
			System.out.println("You are a teenager.");
		else
			System.out.println("You are old.");
	}

	void yearPasses() {
		x++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			person p = new person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}
}
