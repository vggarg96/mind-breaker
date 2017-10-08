package library.fine;

import java.util.Scanner;

public class LibraryFine {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, c, d, e, f;
		// System.out.println("enter the return day");
		a = in.nextInt();
		// System.out.println("enter the return month");
		b = in.nextInt();
		// System.out.println("enter the return year");
		c = in.nextInt();
		// System.out.println("enter the decided day");
		d = in.nextInt();
		// System.out.println("enter the decided month");
		e = in.nextInt();
		// System.out.println("enter the decided year");
		f = in.nextInt();
		int x = 0;
		if (c < f)
			x = 0;
		else if ((c == f) && (b < e))
			x = 0;
		else if ((c == f) && (b == e) && (a < d))
			x = 0;
		else if ((c == f) && (b == e) && (a > d))
			x = 15 * (a - d);
		else if ((c == f) && (b > e))
			x = 500 * (b - e);
		else if (c > f)
			x = 10000 * (c - f);
		System.out.println(x);

	}
}
