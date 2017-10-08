package inheritance;

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

class Student extends Person {
	private int testScores[];
	int sum = 0;

	Student(String firstName, String lastName, int idNumber, int testScores[]) {
		super(firstName, lastName, idNumber);
		this.testScores = testScores;
	}

	char calculate() {
		int sum = 0;
		char x = '0';
		for (int i = 0; i < testScores.length; i++) {
			sum += testScores[i];
		}
		int avg = sum / testScores.length;
		if (avg < 40)
			x = 'T';
		else if ((avg >= 40) && (avg < 55))
			x = 'D';
		else if ((avg >= 55) && (avg < 70))
			x = 'P';
		else if ((avg >= 70) && (avg < 80))
			x = 'A';
		else if ((avg >= 80) && (avg < 90))
			x = 'E';
		else if ((avg >= 90) && (avg <= 100))
			x = 'O';
		return x;
	}
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}
