package hello.world;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println("Hello, World.");
		System.out.println(s);
	}
}
