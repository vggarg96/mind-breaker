package utopian.tree;

import java.util.Scanner;

public class UtopianTree {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// System.out.println("enter the no of cases");
		int n = s.nextInt();
		// System.out.println("enter the cycles");
		int a[] = new int[n];
		int i, j;

		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		// for (i = 0; i < n; i++) {
		// System.out.println(a[i]);
		// }
		int h = 1;
		int b[] = new int[n];
		b[0] = h;
		// System.out.println("study the cases");
		for (i = 0; i < n; i++) {
			h = 1;
			for (j = 0; j < a[i]; j++) {
				if (j % 2 == 0) {
					h = h * 2;
				} else {
					h = h + 1;
				}
			}
			b[i] = h;
		}
		for (i = 0; i < n; i++) {
			System.out.println(b[i]);
		}
	}
}
