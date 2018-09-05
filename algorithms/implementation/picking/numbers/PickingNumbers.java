package picking.numbers;

import java.util.Scanner;

public class PickingNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the size");
		int n = in.nextInt();
		// System.out.println("enter the elements");
		int i, j;
		int a[] = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int x = 0;
		int c[] = new int[n];
		for (i = 0; i < n; i++) {
			x = 0;
			for (j = 0; j < n; j++) {

				if ((a[i] - a[j] <= 1) && (a[i] - a[j] >= 0))
					x++;
			}
			c[i] = x;
		}
		// for (i = 0; i < n; i++)
		// System.out.println(a[i] + " " + c[i]);
		int k = 0, y = 0;
		for (i = 0; i < n; i++) {
			if (k < c[i]) {
				k = c[i];
				y = i;
			}
		}
		System.out.println(k);
		// System.out.println(y + " " + a[y] + " " + k);
		// int b[] = new int[n];
		// for (i = 0; i < n; i++) {
		// b[i] = arr(a[i], a[y]);
		// }
		// for (i = 0; i < n; i++) {
		// System.out.println(b[i]);
		// }
	}
}
