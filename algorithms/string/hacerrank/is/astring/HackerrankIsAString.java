package hacerrank.is.astring;

import java.util.Scanner;

public class HackerrankIsAString {
	

public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = "hackerrank";
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String a = in.next();
			int k = 0, j = 0;
			while (k < s.length()) {
				if (s.charAt(k) == a.charAt(j))
					k++;
				j++;
				if (k == s.length()) {
					System.out.println("YES");
					break;
				} else if (j == a.length()) {
					System.out.println("NO");
					break;
				}
			}
		}
	}
}
