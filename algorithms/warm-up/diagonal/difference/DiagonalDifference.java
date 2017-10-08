package diagonal.difference;

import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i, j, x = 0, y = 0;
		int res;
		n = in.nextInt();
		int[][] a = new int[n][n];

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = in.nextInt();
			}
		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (i == j) {
					x = x + a[i][j];

				}
				if ((i + j) == (n - 1)) {
					y = y + a[i][j];

				}
			}
		}
		if (x > y) {
			res = x - y;
		} else if (x < y)
			;
		{
			res = y - x;
		}
		if (x == y) {
			res = 0;
		}
		if (res < 0)
			res = -res;
		System.out.println(res);
	}
}
