package flatland.space.station;

import java.util.Scanner;

public class FlatlandSpaceStation {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		boolean x[] = new boolean[n];
		for (int i = 0; i < m; i++) {
			int z = in.nextInt();
			x[z] = true;
		}
		int z[] = new int[m + 1];
		int c = 0, k = 0;
		for (int i = 0; i < n; i++) {
			if (x[i]) {
				z[k++] = c;
				c = 0;
			} else
				c++;
		}
		z[k] = c;
		c = 0;
		int j = 0;
		for (int i = 0; i < z.length; i++) {
			if ((i > 0) && (i < z.length - 1)) {
				if (c < (z[i] + 1) / 2)
					c = (z[i] + 1) / 2;
			} else {
				if (c < z[i])
					c = z[i];
			}
		}
		System.out.println(c);
	}
}
