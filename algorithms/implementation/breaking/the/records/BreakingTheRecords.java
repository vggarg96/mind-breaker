package breaking.the.records;

import java.util.Scanner;

public class BreakingTheRecords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no of cases");
		int n = in.nextInt();
		int i, x = 0, z = 0, q = 0, w = 0;
		int a[] = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		x = a[0];
		z = a[0];
		for (i = 1; i < n; i++) {
			if (x < a[i]) {
				x = a[i];
				q++;
			}
			if (z > a[i]) {
				z = a[i];
				w++;
			}
		}
		System.out.println(q + " " + w);

	}
}
