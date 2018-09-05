package time.conversion;

import java.util.Scanner;

public class TimeConversion {
	public static void main(String[] args) {
		int i, n = 10, x, y;
		Scanner in = new Scanner(System.in);
		char[] a = new char[n];
		char[] b = new char[n - 2];
		// System.out.println("enter the time");
		String c = in.next();
		// System.out.println(c);
		for (i = 0; i < n; i++) {
			a[i] = c.charAt(i);
		}

		if (a[9] != 'M' && (a[8] != 'A' || a[8] != 'P')) {
			System.out.println("invalid input");
			return;
		}
		if (a[0] == '1' && a[1] > '2' && a[8] == 'P' && a[9] == 'M') {
			System.out.println("invalid input");
			return;
		}
		if (a[0] > '1' && a[3] > '6' && a[6] > '6') {
			System.out.println("invalid input");
			return;
		}
		for (i = 0; i < n - 2; i++) {
			b[i] = a[i];
		}
		if (a[8] == 'P' && a[9] == 'M') {
			if (a[0] == '1' && a[1] == '2') {
				y = (int) b[0];
				x = (int) b[1];
			} else {
				y = (int) a[0];
				y = y + 1;
				x = (int) a[1];
				x = x + 2;
				if (x > 57) {
					y = y + 1;
					x = 48 + (x - 58);
				}
			}
			b[1] = (char) x;
			b[0] = (char) y;
			for (i = 0; i < n - 2; i++) {
				System.out.print(b[i]);
			}
		} else {
			if (b[0] == '1' && b[1] == '2') {
				b[0] = '0';
				b[1] = '0';
			}
			for (i = 0; i < n - 2; i++) {
				System.out.print(b[i]);
			}
		}

	}
}
