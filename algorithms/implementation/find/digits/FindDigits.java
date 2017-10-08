package find.digits;

import java.util.Scanner;

public class FindDigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no of integers");
		int n = in.nextInt();
		// System.out.println("enter the integers");
		int a[] = new int[n];
		int i;
		int count[] = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int w, z, r, q = 0;
		for (i = 0; i < n; i++) {
			w = a[i];
			z = w;
			while (w > 0) {
				r = w % 10;
				q = q * 10 + r;
				w = w / 10;

				if (r != 0) {
					if (z % r == 0) {
						count[i]++;
					}

				}

			}

		}
		for (i = 0; i < n; i++) {
			System.out.println(count[i]);
		}
	}
}
