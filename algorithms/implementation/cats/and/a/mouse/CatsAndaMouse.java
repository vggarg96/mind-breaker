package cats.and.a.mouse;

import java.util.Scanner;

public class CatsAndaMouse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no of cases");
		int n = in.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		int i;
		// System.out.println("read the data");
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			c[i] = in.nextInt();
		}
		// System.out.println("calculate the result");
		for (i = 0; i < n; i++) {
			int y = a[i] - c[i];
			if (y < 0) {
				y = -y;
			}
			int z = b[i] - c[i];
			if (z < 0) {
				z = -z;
			}
			if (y > z) {
				System.out.println("Cat B");
			} else if (y < z) {
				System.out.println("Cat A");
			} else {
				System.out.println("Mouse C");
			}
		}
	}
}
