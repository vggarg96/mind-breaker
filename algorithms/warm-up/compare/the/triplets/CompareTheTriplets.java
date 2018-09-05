package compare.the.triplets;

import java.util.Scanner;

public class CompareTheTriplets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, n = 3;
		int x = 0;
		int y = 0;
		int[] a = new int[n];
		int[] b = new int[n];

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		for (i = 0; i < n; i++) {
			b[i] = in.nextInt();
		}
		for (i = 0; i < n; i++) {
			if (a[i] > b[i]) {
				x++;
			}
			if (a[i] < b[i]) {
				y++;
			}
			if (a[i] == b[i]) {
				x = x;
				y = y;
			}
		}
		System.out.println(x + " " + y);

	}
}
