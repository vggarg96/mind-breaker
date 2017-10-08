package camel.cases;

import java.util.Scanner;

public class CamelCases {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s;
		s = in.next();
		int i, count = 1;
		for (i = 0; i < s.length(); i++) {
			if (((int) s.charAt(i) >= 65) && ((int) s.charAt(i) <= 90))
				count++;
		}
		System.out.println(count);
	}
}
