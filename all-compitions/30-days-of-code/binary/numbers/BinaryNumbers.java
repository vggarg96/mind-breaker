package binary.numbers;

import java.util.Scanner;

public class BinaryNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// for (int j = 1; j < 20; j++) {
		// int n = j;
		int n = in.nextInt();
		String m = "";
		while ((n / 2) + 1 != 1) {
			if (n % 2 == 0)
				m = 0 + m;
			else
				m = 1 + m;
			n = n / 2;
		}
		m = 1 + m;
		// System.out.println(j + " " + m);
		// System.out.println(n + " " + m);
		int x = 1, max = 0, i = 0;
		while (i < m.length()) {
			if (i + 1 < m.length()) {
				if (m.charAt(i + 1) == '1')
					x++;
				if ((m.charAt(i + 1) == '0') || (i + 1 == m.length())) {
					if (x > max)
						max = x;
					x = 0;
				}
			}
			i++;
		}
		if (x > max)
			max = x;
		if (max == 0)
			max = x;
		System.out.println(max);
	}
}
