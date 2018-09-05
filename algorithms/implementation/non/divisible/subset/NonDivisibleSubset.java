package non.divisible.subset;

import java.util.Scanner;

public class NonDivisibleSubset {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		int c = 0;
		int x[] = new int[k];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		for (int i = 0; i < n; i++)
			x[a[i] % k]++;
		// for (int i = 0; i < n; i++)
		// System.out.println(x[i]);
		c += x[0] < 1 ? x[0] : 1;
		for (int i = 1; i < k / 2 + 1; i++) {
			if (i != k - i)
				c += x[i] > x[k - i] ? x[i] : x[k - i];

		}
		if (k % 2 == 0)
			c++;
		System.out.println(c);
	}
}
