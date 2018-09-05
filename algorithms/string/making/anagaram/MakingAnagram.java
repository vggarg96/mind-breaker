package making.anagaram;

import java.util.Scanner;

public class MakingAnagram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		int c = 0;
		int x[] = new int[26];
		int x1[] = new int[26];
		// System.out.println((int)'a');
		for (int i = 0; i < a.length(); i++)
			x[(int) a.charAt(i) - 97]++;
		for (int i = 0; i < b.length(); i++) {
			x1[(int) b.charAt(i) - 97]++;
		}
		for (int i = 0; i < 26; i++)
			c += x[i] > x1[i] ? x[i] - x1[i] : x1[i] - x[i];
		// y = a.length() + b.length() - 2 * c;
		System.out.println(c);
	}
}
