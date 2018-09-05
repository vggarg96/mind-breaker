package two.strings;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String s = in.next();
			String r = in.next();
			int j = 0, f = 0, k = 0;
			while (j < s.length() && k < r.length()) {
				if (s.charAt(j++) == r.charAt(k++)) {
					f = 1;
					break;
				}
			}
			if (f == 1)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}

}
