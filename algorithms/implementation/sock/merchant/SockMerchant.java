package sock.merchant;

import java.util.Scanner;

public class SockMerchant {
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		int i, j, count = 0;
		// System.out.println("enter the no of socks");
		int n = in.nextInt();
		// System.out.println("enter the color of the socks");
		int a[] = new int[n];
		for (i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		boolean b[] = new boolean[n];
		int c[] = new int[n];
		for (i = 0; i < n; i++) {
			c[i] = 0;
		}
		for (i = 0; i < n; i++) {
			if (!b[i]) {
				for (j = i + 1; j < n; j++) {
					if (a[i] == a[j]) {
						b[j] = true;
						c[i]++;
						b[i] = true;
					}
				}
			}
			c[i]++;
		}
		int d[] = new int[n];
		for (i = 0; i < n; i++) {
			if ((c[i] / 2) > 0) {
				d[i] = c[i] / 2;
			}
		}
		int sum = 0;
		for (i = 0; i < n; i++) {
			// System.out.println(c[i]+"\t "+d[i]);
			sum = sum + d[i];
		}
		System.out.println(sum);
	}
}
