package mini.max.sum;

import java.util.Scanner;

public class MiniMaxSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no of elements");
		int n = 5;
		long[] a = new long[n];
		int i, j;
		long t, min = 0, max = 0;
		for (i = 0; i < n; i++) {
			a[i] = in.nextLong();
		}
		for (j = 0; j < n; j++) {
			for (i = 1; i < n; i++) {
				if (a[i - 1] > a[i]) {
					t = a[i - 1];
					a[i - 1] = a[i];
					a[i] = t;
				}
			}
		}
		// for (i = 0; i < n; i++) {
		// System.out.println(a[i]);
		// }
		for (i = 0; i < (n - 1); i++) {
			min = min + a[i];

		}
		for (i = 1; i < n; i++) {
			max = max + a[i];
		}
		System.out.println(min + " " + max);
	}
}
