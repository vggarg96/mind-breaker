package two.d.array;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = 6;
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = in.nextInt();
		int sum = 0, x = -63;
		for (int i = 1; i < n - 1; i++) {
			for (int j = 1; j < n - 1; j++) {
				sum = 0;
				sum = a[i][j] + a[i - 1][j] + a[i - 1][j - 1] + a[i - 1][j + 1] + a[i + 1][j] + a[i + 1][j - 1]
						+ a[i + 1][j + 1];
				if (sum > x)
					x = sum;
			}
		}
		System.out.println(x);

	}
}
