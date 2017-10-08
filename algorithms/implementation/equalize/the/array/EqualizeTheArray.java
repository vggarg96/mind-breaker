package equalize.the.array;

import java.util.Scanner;

public class EqualizeTheArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no of elements");
		int n = in.nextInt();
		// System.out.println("enter the elements");
		int a[] = new int[n];
		int i, j;
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int c[] = new int[n];
		boolean[] b = new boolean[n];
		for (i = 0; i < n; i++) {
			if (!b[i])
				for (j = 0; j < n; j++) {
					if ((!b[j]) && (a[i] == a[j])) {
						c[i]++;
						b[j] = true;
					}

				}
			b[i] = true;
		}
		int x = 0, y = 0;
		for (i = 0; i < n; i++)
			if (x < c[i]) {
				x = c[i];
				y = i;
			}
		int sum = 0;
		for (i = 0; i < n; i++) {
			if (i != y)
				sum = sum + c[i];
		}
		System.out.println(sum);
	}
}
