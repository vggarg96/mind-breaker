package equal;

import java.util.Scanner;

public class Equal {
	static int min(int a[]) {
		int x = a[0];
		for (int i = 0; i < a.length; i++)
			if (a[i] < x)
				x = a[i];
		return x;

	}

	static int max(int a[]) {
		int x = a[0];
		for (int i = 0; i < a.length; i++)
			if (a[i] > x)
				x = a[i];
		return x;

	}

	static int one(int c[], int k) {
		int j = 0, count = 0, y = 0;
		k = k;
		while (j != c.length) {
			if (c[j] == k) {
				j++;
				continue;
			}
			if ((c[j] - k) / 5 > 0) {
				y = (c[j] - k) / 5;
				c[j] = c[j] - y * 5;
				count += y;
			} else if ((c[j] - k) / 2 > 0) {
				y = (c[j] - k) / 2;
				c[j] = c[j] - y * 2;
				count += y;
			} else if ((c[j] - k) / 1 > 0) {
				c[j] = c[j] - 1;
				count++;
			}
		}
		return count;
	}

	static int one(int a[]) {
		int j = 0, count = 0, y = 0;
		while (j != a.length) {
			if (a[j] == 0) {
				j++;
				continue;
			}
			if ((a[j]) / 5 > 0) {
				y = (a[j]) / 5;
				a[j] = a[j] - y * 5;
				count += y;
			} else if ((a[j]) / 2 > 0) {
				y = (a[j]) / 2;
				a[j] = a[j] - y * 2;
				count += y;
			} else if ((a[j]) / 1 > 0) {
				a[j] = a[j] - 1;
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int a[] = new int[n];
			for (int j = 0; j < n; j++)
				a[j] = in.nextInt();
			int b[] = new int[n];
			for (int j = 0; j < n; j++)
				b[j] = a[j];
			int k = min(a);
			int v = max(a);
			int x = one(a, k);
			int z = 0;
			if (v - k < 10)
				z = one(b);
			if ((z < x) && (z != 0))
				System.out.println(z);
			else
				System.out.println(x);
		}
	}
}
