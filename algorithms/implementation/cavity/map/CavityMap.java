package cavity.map;

import java.util.Scanner;

public class CavityMap {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char a[] = new char[n * n];
		String b = "", c;
		for (int i = 0; i < n; i++) {
			c = in.next();
			b = b + c;
		}
		a = b.toCharArray();
		for (int i = 0; i < n * n; i++) {
			if ((i >= n) && (i % n != 0) && (i % n != n - 1) && (i < n * (n - 1)))
				if ((a[i] > a[i - 1]) && (a[i] > a[i + 1]) && (a[i] > a[i - n]) && (a[i] > a[i + n]))
					a[i] = 'X';
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i % n == n - 1)
				System.out.println();
		}
	}
}
