package strange.counter;

import java.util.Scanner;

public class StrangeCounter {
	public static void main(String args[]) {
		long i = 3;
		long t = 1;
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long k = 1;
		if (n > 1) {
			while (t < n) {
				k = k * 2;
				t = 3 * (k - 1);
			}
			k = k / 2;
			i = 3 * k;
			t = t - 3 * k + 1;
			i = i - (n - t);
			t = n;

			System.out.println(i);
		} else
			System.out.println(i);
	}
}
