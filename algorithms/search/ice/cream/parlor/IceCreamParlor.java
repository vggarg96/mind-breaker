package ice.cream.parlor;

import java.util.Scanner;

public class IceCreamParlor {
	static int find(int b, int a[], int k) {
		int f = 0, i = 0;
		for (i = 0; i < a.length; i++) {
			if ((a[i] == b) && (i != k)) {
				f = 1;
				break;
			}
		}
		if (f == 0)
			return -1;
		else
			return i;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int m = in.nextInt();
			int n = in.nextInt();
			int a[] = new int[n];
			for (int j = 0; j < n; j++)
				a[j] = in.nextInt();
			int j = 0;
			while (j < n) {
				if (a[j] > m) {
					j++;
					continue;
				}
				int x = a[j];
				int y = find(m - x, a, j);
				if ((y < 0)) {
					j++;
					continue;
				} else {
					if (y < j)
						System.out.println((y + 1) + " " + (j + 1));
					else
						System.out.println((j + 1) + " " + (y + 1));
					break;
				}
			}
				
		}
	}
}