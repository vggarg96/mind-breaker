package migratory.birds;

import java.util.Scanner;

public class MigratoryBirds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// System.out.println("enter the no of birds")
		int n = in.nextInt();
		int[] a = new int[n];
		int i, j;
		// System.out.println("enter the data")
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		boolean x[] = new boolean[n];
		int count[] = new int[n];
		for (i = 0; i < n; i++) {
			if (!x[i]) {
				count[i]++;
				for (j = i + 1; j < n; j++) {
					if (!x[j]) {
						if (a[i] == a[j]) {
							count[i]++;
							x[j] = true;
							x[i] = true;
						}
					}
				}
			}
		}
		int q = 0, w = 0, e = 0, t = 0;
		for (i = 0; i < n; i++) {
			if (count[i] != 0) {
				if (q < count[i]) {
					q = count[i];
					w = i;
				} else if (q == count[i]) {
					t = count[i];
					e = i;
				}
			}
		}
		if (q == t) {
			if (a[w] > a[t])
				System.out.println(a[t]);
			else
				System.out.println(a[w]);
		} else {
			System.out.println(a[w]);
		}
	}
}
