package minimum.distance;

import java.util.Scanner;

public class MinimumDistance {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = in.nextInt();
		// int i=0,j=n-1;
		int f = 0;
		boolean d[] = new boolean[n * n];
		int s[] = new int[n * n];
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j) {
					if (a[i] == a[j]) {
						if ((i - j) > 0) {
							d[k] = true;
							f = 1;
							s[k++] = i - j;
						} else {
							f = 1;
							d[k] = true;
							s[k++] = j - i;
						}
					}
				}
			}
		}
		k = s[0];
		for (int i = 0; i < s.length; i++) {
			if ((k > s[i]) && (d[i] == true))
				k = s[i];
		}
		if (f == 0)
			k = -1;
		System.out.println(k);
	}
}
