package encryption;

import java.util.Scanner;

public class Encryption {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the string");
		String s = in.next();
		// System.out.println(s.length());
		double p;
		int n = s.length();

		p = Math.sqrt(n);

		n = (int) p;
		int i, u;
		p = s.length() / p;
		if ((p - (int) p) > 0.5)
			u = (int) p + 1;
		else
			u = (int) p;

		String[] x = new String[u];
		i = 0;
		int j = 0;
		if ((p - u) == 0) {
			for (i = 0; i < s.length(); i++) {
				if (i % (n) == 0) {
					if ((n + i) <= s.length())
						x[j++] = s.substring(i, n + i);
					else
						x[j++] = s.substring(i, s.length());
				}
			}
		} else {
			for (i = 0; i < s.length(); i++) {
				if (i % (n + 1) == 0) {
					if ((n + 1 + i) <= s.length())
						x[j++] = s.substring(i, n + 1 + i);
					else
						x[j++] = s.substring(i, s.length());
				}
			}
		}
		j = 0;
		for (i = 0; i <= n; i++) {
			// System.out.println(x.length);
			for (j = 0; j < u; j++) {
				int z = x[j].length();
				if (i < z) {

					// System.out.println(j);
					System.out.print(x[j].charAt(i));
				}
			}
			System.out.print(" ");

		}

	}
}
