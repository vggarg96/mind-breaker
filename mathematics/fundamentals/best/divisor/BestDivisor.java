package best.divisor;

import java.util.Scanner;

public class BestDivisor {
	static int digsum(int k) {
		int r, q = 0;
		while (k > 0) {
			r = k % 10;
			q = q + r;
			k = k / 10;
		}
		return q;
	}

	static int res(int n) {
		int i = 0, k = 0, x = 0, a = 0;
		for (i = n; i >= 1; i--)
			if (n % i == 0) {
				k = digsum(i);
				if (k > x) {
					x = k;
					a = i;
				} else if (k == x) {
					a = Math.min(a, i);
				}
			}
		return a;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(res(n));

	}
}
