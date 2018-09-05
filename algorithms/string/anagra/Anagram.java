package anagra;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String s = in.next();
			if (s.length() % 2 == 1)
				System.out.println("-1");
			else {
				String a = s.substring(0, s.length() / 2);
				String b = s.substring(s.length() / 2);
				// System.out.println(a + " " + b);
				int c = 0;
				int x[] = new int[26];
				int x1[] = new int[26];
				// System.out.println((int)'a');
				for (int j = 0; j < a.length(); j++)
					x[(int) a.charAt(j) - 97]++;
				for (int j = 0; j < b.length(); j++) {
					x1[(int) b.charAt(j) - 97]++;
				}
				for (int j = 0; j < 26; j++)
					c += x[j] > x1[j] ? x[j] - x1[j] : x1[j] - x[j];
				// y = a.length() + b.length() - 2 * c;
				System.out.println(c / 2);
			}
		}
	}
}
