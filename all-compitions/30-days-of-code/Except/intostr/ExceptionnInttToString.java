package Except.intostr;

import java.util.Scanner;

public class ExceptionnInttToString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int x = 0;
		try {
			x = Integer.parseInt(s);
			System.out.println(x);
		} catch (Exception e) {
			System.out.println("Bad String");
		}

	}
}
