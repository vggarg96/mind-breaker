package jumping.on.the.clouds;

import java.util.Scanner;

public class JumpingOnTheClouds {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// System.out.println("enter the no of clouds");
		int n = in.nextInt();
		// System.out.println("enter the type of cloud");
		int a[] = new int[n];
		int i;

		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		int k = 0, count = 0;
		for (i = 0; i < n; i++) {
			if (k >= (n - 1))
				break;

			if (((k + 2) < n) && (a[k + 2] != 1)) {
				k = k + 2;
				count++;
			} else {
				k = k + 1;
				count++;
			}
		}
		if ((count != -1))
			System.out.println(count);

	}
}
