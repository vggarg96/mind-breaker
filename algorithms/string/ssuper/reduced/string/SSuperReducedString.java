package ssuper.reduced.string;

import java.util.Scanner;

public class SSuperReducedString {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int f = 1, j = 1, i = 0, k;
		char z = s.charAt(i);
		while (f == 1) {
			k = i;
			if (j >= s.length())
				break;
			if (s.charAt(i) == s.charAt(j)) {
				s = s.substring(0, i) + s.substring(j + 1, s.length());
				i = 0;
				j = i + 1;
			} else {
				i++;
				j++;
			}
		}
		System.out.println(s.length());
		if (s.length() == 0)
			System.out.println("Empty String");
		else
			System.out.println(s);

	}
}