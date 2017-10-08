package beautiful.days.at.the.movies;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the starting date");
		int s = in.nextInt();
		// System.out.println("enter the last day");
		int l = in.nextInt();
		// System.out.println("enter the special key");
		int key = in.nextInt();
		int i;
		int x = l - s + 1;
		// System.out.println("store the dates");
		int a[] = new int[x];
		for (i = 0; i < (x); i++) {
			a[i] = s + i;
		}
		// for (i = 0; i < a.length; i++) {
		// System.out.println(a[i]);
		// }
		int rev[] = new int[x];
		for (i = 0; i < a.length; i++) {
			int w = a[i];
			int q = 0;
			int r = 0;
			while (w > 0) {
				r = w % 10;
				q = q * 10 + r;
				w = w / 10;
			}
			rev[i] = q;
		}
		// for (i = 0; i < a.length; i++) {
		// System.out.println(a[i] + " " + rev[i]);
		// }
		int count = 0;
		for (i = 0; i < a.length; i++) {
			if (((a[i] - rev[i]) % key) == 0)
				count++;
		}
		System.out.println(count);
	}
}
