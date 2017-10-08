package beautiful.word;

import java.util.Scanner;

public class BeautifulWord {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the string");
		String s;
		s = in.next();
		// System.out.println(s.length());
		int n = s.length();
		// System.out.println("convert string to array of character");
		// char c[] = s.toCharArray();
		int i = 1;
		int flag = 1;
		String x = "\0";
		char y = '\0';
		char z = '\0';
		for (i = 1; i < n; i++) {
			// System.out.println(s.charAt(0));
			y = s.charAt(i);
			z = s.charAt(i - 1);
			if (y == z) {
				flag = 0;
				break;
			} else if ((y == 'a') || (y == 'e') || (y == 'i') || (y == 'o') || (y == 'u') || (y == 'y')) {
				if ((z == 'a') || (z == 'e') || (z == 'i') || (z == 'o') || (z == 'u') || (z == 'y')) {
					flag = 0;
					break;
				}

				else
					flag = 1;
			} else
				flag = 1;
		}
		if (flag == 1)
			x = "Yes";
		else
			x = "No";
		System.out.println(x);
	}
}
