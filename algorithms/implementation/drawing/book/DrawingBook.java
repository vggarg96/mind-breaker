package drawing.book;

import java.util.Scanner;

public class DrawingBook {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// System.out.println("enter the no of pages");
		int n = s.nextInt();
		// System.out.println("enter the key page");
		int q;
		int k = s.nextInt();
		int res;
		if (n % 2 == 0) {
			if ((n / 2) >= k) {
				if (k % 2 == 0) {
					res = k / 2;
				} else {
					if (k == 1) {
						res = 0;
					} else {
						res = k / 2;
					}
				}
			} else {
				q = n - k;
				if (q % 2 == 0) {
					res = q / 2;
				} else {
					if (q == 1) {
						res = 0;
					} else {
						res = q / 2 + 1;
					}
				}
			}
		} else {
			if ((n / 2) >= k) {
				if (k % 2 == 0) {
					res = k / 2;
				} else {
					if (k == 1) {
						res = 0;
					} else {
						res = k / 2;
					}
				}
			} else {
				q = n - k;
				res = q / 2;
			}
		}
		System.out.println(res);

	}
}
