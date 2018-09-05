package repeated.string;

import java.util.Scanner;

public class RepeatedString {

	static long count(int z, String s, long n) {
		if (z == s.length())
			return n;
		else if (z == 0)
			return 0;
		else {
			long w = n / s.length();
			long c = 0, x = 0;
			int i = 0;
			c = (n / s.length()) * z;
			if (n % s.length() != 0) {
				while (x < n % s.length()) {
					if (s.charAt(i) == 'a')
						c++;
					if (i == s.length() - 1)
						i = -1;
					i++;
					x++;
				}
			}
			return c;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int j = 0, z = 0;
		while (j < s.length()) {
			if (s.charAt(j) == 'a')
				z++;
			j++;
		}
		long n = in.nextLong();
		System.out.println(count(z, s, n));
	}

}
